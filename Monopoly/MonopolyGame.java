import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MonopolyGame extends JPanel {
	private static Tile[] board;

	private static ArrayList<Player> players;

	private static int indexOfCurrentPlayer;

	/**
	 * sets up board[], creates players, sets game up, does not draw GUI
	 * 
	 * @param numPlayers
	 */
	public static void initialize(int numPlayers) {
		players = new ArrayList<Player>();

		if (numPlayers == 1) {
			throw new IllegalArgumentException();
		}
		for (int loop = 0; loop < numPlayers; loop++) {
			players.add(new Player(250));
		}

		indexOfCurrentPlayer = 0;

		board = new Tile[40];
		// board[0]=go
		board[0] = new SpecialTile("Go!", 0, 0, 0, 0);
		board[1] = new PropertyTile("Mediterranean Ave", 60, 50, 0, 0);
		board[3] = new PropertyTile("Baltic Ave", 60, 50, 0, 0);
		board[6] = new PropertyTile("Oriental Ave", 100, 50, 0, 0);
		board[8] = new PropertyTile("Vermont Ave", 100, 50, 0, 0);
		board[9] = new PropertyTile("Conneticut Ave", 120, 50, 0, 0);
		board[11] = new PropertyTile("St.Charles Place", 140, 100, 0, 0);
		board[13] = new PropertyTile("States Ave", 140, 100, 0, 0);
		board[14] = new PropertyTile("Virginia Ave", 160, 100, 0, 0);
		board[16] = new PropertyTile("St. James Place", 180, 100, 0, 0);
		board[18] = new PropertyTile("Tennesse Ave", 180, 100, 0, 0);
		board[19] = new PropertyTile("New York Ave", 200, 100, 0, 0);
		board[21] = new PropertyTile("Kentucky Ave", 220, 150, 0, 0);
		board[23] = new PropertyTile("Indiana Ave", 220, 150, 0, 0);
		board[24] = new PropertyTile("Illinois Ave", 240, 150, 0, 0);
		board[26] = new PropertyTile("Atlantic Ave", 260, 150, 0, 0);
		board[27] = new PropertyTile("Ventnor Ave", 260, 150, 0, 0);
		board[29] = new PropertyTile("Marvin Gardens", 280, 150, 0, 0);
		board[31] = new PropertyTile("Pacific Ave", 300, 200, 0, 0);
		board[32] = new PropertyTile("North Carolina Ave", 300, 200, 0, 0);
		board[34] = new PropertyTile("Pennysylvania Ave", 320, 200, 0, 0);
		board[37] = new PropertyTile("Park Place", 350, 200, 0, 0);
		board[39] = new PropertyTile("Boardwalk", 400, 200, 0, 0);
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board[2] = new SpecialTile("Community Chest", 0, 0, 0, 0);
		board[4] = new SpecialTile("Income Tax", 0, 0, 0, 0);
		board[5] = new SpecialTile("Reading Railroad", 0, 200, 0, 0);
		board[10] = new SpecialTile("Jail", 0, 0, 0, 0);
		board[17] = new SpecialTile("Community Chest", 0, 0, 0, 0);
		board[12] = new SpecialTile("Electric Company", 0, 150, 0, 0);
		board[20] = new SpecialTile("Free Parking", 0, 0, 0, 0);
		board[25] = new SpecialTile("B & O RR", 0, 200, 0, 0);
		board[28] = new SpecialTile("Water Works", 0, 150, 0, 0);
		board[31] = new SpecialTile("Go to Jail", 0, 0, 0, 0);
		board[33] = new SpecialTile("Community Chest", 0, 0, 0, 0);
		board[35] = new SpecialTile("Short Line RR", 0, 200, 0, 0);
		board[36] = new SpecialTile("Chance", 0, 0, 0, 0);
		board[15] = new SpecialTile("Pennysylvania Railroad", 0, 200, 0, 0);
		board[22] = new SpecialTile("Chance", 0, 0, 0, 0);
		board[38] = new SpecialTile("Luxury Tax", 0, 0, 0, 0);
		board[7] = new SpecialTile("Chance", 0, 0, 0, 0);

	}

	/** returns the index of the current player in the players ArrayList */
	public static int getCurrentPlayer() {
		return indexOfCurrentPlayer;
	}

	// for switching players turns, think of something cleaner?
	public static void switchPlayer() {
		int index = getCurrentPlayer() + 1;
		if (index > players.size() - 1) {
			indexOfCurrentPlayer = index - players.size();
		} else
			indexOfCurrentPlayer = index;
	}

	public static int rollDiceOne() {
		Random r = new Random();
		return (r.nextInt(5) + 1);
	}

	public static int rollDiceTwo() {
		Random r = new Random();
		return (r.nextInt(5) + 1);
	}

	/**
	 * rollDice will roll Dice one and two, then advance currentPlayer then
	 * switches currentPlayer if necessary (no doubles rolled)
	 */
	public static void rollDice() {
		int x = rollDiceOne();
		int y = rollDiceTwo();
		players.get(getCurrentPlayer()).advance(x + y);
		if (x != y)
			switchPlayer();
	}

	/**
	 * checks if currentPlayer can afford to purchase property, then adds
	 * property (player's current location) to Player's individual property list
	 * and sets the current Player as the owner in the actual property tile
	 */
	public static String purchaseProperty() {
		if (board[players.get(getCurrentPlayer()).getLocation()].isPurchaseable() && players.get(getCurrentPlayer())
				.getBalance() >= board[players.get(getCurrentPlayer()).getLocation()].getPurchaseCost()) {
			board[players.get(getCurrentPlayer()).getLocation()].buyProperty(players.get(getCurrentPlayer()));
			players.get(getCurrentPlayer()).addProperty(players.get(getCurrentPlayer()).getLocation());
			players.get(getCurrentPlayer())
					.loseMoney(board[players.get(getCurrentPlayer()).getLocation()].getPurchaseCost());
			return "successful purchase";
		} else
			return "property cannot be purchased";
	}

	/**
	 * method checks to make sure that player has enough money to purchase house
	 * then subtracts cost of house from player's bank account, then calls
	 * addHouse on the tile on which house is purchased; all addHouse does is
	 * increase Housecount
	 */
	public static boolean purchaseHouse() {
		// need to check to make sure that can't call purchaseHotel on
		// SpecialTile
		if (board[players.get(getCurrentPlayer()).getLocation()].getOwner().equals(players.get(getCurrentPlayer()))) {
			players.get(getCurrentPlayer())
					.loseMoney(board[players.get(getCurrentPlayer()).getLocation()].getHouseCost());
			board[players.get(getCurrentPlayer()).getLocation()].addHouse();
			return true;
		}
		return false;
	}

	/**
	 * method checks to make sure 4 houses already owned, then checks to make
	 * sure person can afford hotel hotel cost=house cost the 4 houses to 1
	 * hotel swap is done in PropertyTile's addHotel method
	 */
	public static boolean purchaseHotel() {
		// need to check to make sure that can't call purchaseHotel on
		// SpecialTile
		if (board[players.get(getCurrentPlayer()).getLocation()].numHouses() < 4) {
			return false;
		}
		if (players.get(getCurrentPlayer()).getBalance() < board[players.get(getCurrentPlayer()).getLocation()]
				.getHouseCost()) {
			return false;
		}
		players.get(getCurrentPlayer()).loseMoney(board[players.get(getCurrentPlayer()).getLocation()].getHouseCost());
		board[players.get(getCurrentPlayer()).getLocation()].addHotel();
		return true;
	}

	/**
	 * deducts the rent fee from current player (determined by the landingFee
	 * methods in PropertyTile/SpecialTile), then switches player
	 */
	public static void chargeRent() {
		Tile currentLocation = board[players.get(getCurrentPlayer()).getLocation()];
		if (currentLocation.getOwner().equals(null)) {

		} else {
			if (currentLocation.getOwner().isInJail() == true) {
				// no rent charged if owner is in Jail
			} else {
				players.get(getCurrentPlayer()).loseMoney(currentLocation.getLandingFee());
				currentLocation.getOwner().addMoney(currentLocation.getLandingFee());
				switchPlayer();
			}
		}
	}

	public static void mortgageProperty() {

	}

	public static void main(String[] args) {
		int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("how many people are playing?"));
		initialize(numPlayers);

		/** main loop for running the program */
		Scanner reader = new Scanner(System.in);
		String input;
		boolean run = true;

		while (run == true) {
			System.out.println("type roll to roll dice");
			input = reader.nextLine();
			// remember to use .equals and not== for Strings/Objects
			if (input.equals("quit"))
				run = false;
			else {
				if (input.equals("roll")) {
					rollDice();
					// need to check whether or not another player is owed rent
					// money
					System.out.println("Current Player Position:" + players.get(getCurrentPlayer()).getLocation());
					switchPlayer();
				}
			}
		}

	}

	/**
	 * for testing only returns arraylist of players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

}
