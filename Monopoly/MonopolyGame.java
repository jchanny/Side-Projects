import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MonopolyGame extends JPanel {
	private static Tile[] board;

	private static LinkedList<Player> players;

	public static void initialize(int numPlayers) {
		players = new LinkedList<Player>();

		if (numPlayers == 1) {
			throw new IllegalArgumentException();
		}
		for (int loop = 0; loop < numPlayers; loop++) {
			players.add(new Player(0));
		}

		board = new Tile[40];
		// board[0]=go
		// board[31]=jail
		board[1] = new PropertyTile("Mediterranean Ave", 0, 0, 0, 0, 0, 0, 0);
		board[2] = new PropertyTile("Community Chest", 0, 0, 0, 0, 0, 0, 0);
		board[3] = new PropertyTile("Baltic Ave", 0, 0, 0, 0, 0, 0, 0);
		board[6] = new PropertyTile("Oriental Ave", 0, 0, 0, 0, 0, 0, 0);
		board[7] = new PropertyTile("Chance", 0, 0, 0, 0, 0, 0, 0);
		board[8] = new PropertyTile("Vermont Ave", 0, 0, 0, 0, 0, 0, 0);
		board[9] = new PropertyTile("Conneticut Ave", 0, 0, 0, 0, 0, 0, 0);
		board[11] = new PropertyTile("St.Charles Place", 0, 0, 0, 0, 0, 0, 0);
		board[12] = new PropertyTile("Electric Company", 0, 0, 0, 0, 0, 0, 0);
		board[13] = new PropertyTile("States Ave", 0, 0, 0, 0, 0, 0, 0);
		board[14] = new PropertyTile("Virginia Ave", 0, 0, 0, 0, 0, 0, 0);
		board[15] = new PropertyTile("Pennysylvania Railroad", 0, 0, 0, 0, 0, 0, 0);
		board[16] = new PropertyTile("St. James Place", 0, 0, 0, 0, 0, 0, 0);
		board[18] = new PropertyTile("Tennesse Ave", 0, 0, 0, 0, 0, 0, 0);
		board[19] = new PropertyTile("New York Ave", 0, 0, 0, 0, 0, 0, 0);
		board[21] = new PropertyTile("Kentucky Ave", 0, 0, 0, 0, 0, 0, 0);
		board[22] = new PropertyTile("Chance", 0, 0, 0, 0, 0, 0, 0);
		board[23] = new PropertyTile("Indiana Ave", 0, 0, 0, 0, 0, 0, 0);
		board[24] = new PropertyTile("Illinois Ave", 0, 0, 0, 0, 0, 0, 0);
		board[26] = new PropertyTile("Atlantic Ave", 0, 0, 0, 0, 0, 0, 0);
		board[27] = new PropertyTile("Ventnor Ave", 0, 0, 0, 0, 0, 0, 0);
		board[29] = new PropertyTile("Marvin Gardens", 0, 0, 0, 0, 0, 0, 0);
		board[31] = new PropertyTile("Pacific Ave", 0, 0, 0, 0, 0, 0, 0);
		board[32] = new PropertyTile("North Carolina Ave", 0, 0, 0, 0, 0, 0, 0);
		board[34] = new PropertyTile("Pennysylvania Ave", 0, 0, 0, 0, 0, 0, 0);
		board[37] = new PropertyTile("Park Place", 0, 0, 0, 0, 0, 0, 0);
		board[39] = new PropertyTile("Boardwalk", 0, 0, 0, 0, 0, 0, 0);
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1000, 1000);
		board[4] = new SpecialTile("Income Tax", 0, 0, 0, 0, 0, 0, 0);
		board[5] = new SpecialTile("Reading Railroad", 0, 0, 0, 0, 0, 0, 0);
		board[10] = new SpecialTile("Jail", 0, 0, 0, 0, 0, 0, 0);
		board[17] = new SpecialTile("Community Chest", 0, 0, 0, 0, 0, 0, 0);
		board[20] = new SpecialTile("Free Parking", 0, 0, 0, 0, 0, 0, 0);
		board[25] = new SpecialTile("B & O RR", 0, 0, 0, 0, 0, 0, 0);
		board[28] = new SpecialTile("Water Works", 0, 0, 0, 0, 0, 0, 0);
		board[31] = new SpecialTile("Jail", 0, 0, 0, 0, 0, 0, 0);
		board[33] = new SpecialTile("Community Chest", 0, 0, 0, 0, 0, 0, 0);
		board[35] = new SpecialTile("Short Line RR", 0, 0, 0, 0, 0, 0, 0);
		board[36] = new SpecialTile("Chance", 0, 0, 0, 0, 0, 0, 0);
		board[38] = new SpecialTile("Luxury Tax", 0, 0, 0, 0, 0, 0, 0);

		// drawing the board
		JButton dice = new JButton("Roll Dice");
		dice.addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				getCurrentPlayer().advance(MonopolyGame.rollDice());
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		window.getContentPane().add(new MonopolyGame());
		window.add(dice);
		window.setVisible(true);
	}

	public static int rollDice() {
		Random r = new Random();
		return (r.nextInt(5) + 1) + (r.nextInt(5) + 1);
	}

	public static Player getCurrentPlayer() {
		return null;
	}

	public static void purchaseProperty() {

	}

	public static void main(String[] args) {
		int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("how many people are playing?"));
		initialize(numPlayers);
	}

}
