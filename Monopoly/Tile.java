public class Tile {

	private final String name;

	private final int purchaseCost;

	// stores whether or not property has already been bought
	private boolean bought;

	private final int mortgageValue;

	/** flag that holds whether or not property is mortgaged */
	private boolean mortgaged;

	/** fee for landing on property */
	private final int landingFee;

	private Player owner;

	private int houseCount;

	private int hotelCount;

	private int houseCost;

	public Tile(String name, int purchaseCost, int mortgageValue, int landingFee, int houseCost) {
		this.name = name;
		this.purchaseCost = purchaseCost;
		bought = false;
		this.mortgageValue = mortgageValue;
		mortgaged = false;
		this.landingFee = landingFee;
		owner = null;
		houseCount = 0;
		hotelCount = 0;
		this.houseCost = houseCost;
	}

	public String getName() {
		return name;
	}

	public int getPurchaseCost() {
		return purchaseCost;
	}

	public int getMortgageValue() {
		return mortgageValue;
	}

	public boolean isMortgaged() {
		return mortgaged;
	}

	public boolean isPurchaseable() {
		return !bought;
	}

	public int getLandingFee() {
		return landingFee;
	}

	public void buyProperty(Player owner) {
		this.owner = owner;
		bought = true;
	}

	public Player getOwner() {
		return owner;
	}

	public int numHouses() {
		return houseCount;
	}

	public int numHotels() {
		return hotelCount;
	}

	public int getHouseCost() {
		return houseCost;
	}

	public void addHouse() {
		houseCount++;
	}

	public void addHotel() {
		hotelCount++;
	}
}