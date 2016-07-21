
public class PropertyTile extends Tile {

	private int houseCost;

	private int houseFee;

	private int hotelFee;

	private int houseCount;

	private int hotelCount;

	public PropertyTile(String name, int purchaseCost, int houseCost, int mortgageValue, int landingFee) {
		super(name, purchaseCost, mortgageValue, landingFee);
		this.houseCost = houseCost;
		houseCount = 0;
		hotelCount = 0;
	}

	/**
	 * landing fee is determined by multiplying landing fee by 3x, 5x, etc
	 */
	public int getLandingFee() {
		return super.getLandingFee();
	}

	public void addHouse() {
		houseCount++;
	}

	/**
	 * it is assumed that when addHotel is called, all checks to make sure
	 * player can afford and is legally allowed to purchase hotel are done
	 */
	public void addHotel() {
		hotelCount++;
		houseCount = houseCount - 4;
	}

	public int getHouseCost() {
		return houseCost;
	}

	public int numHouses() {
		return numHouses();
	}

	public int numHotels() {
		return numHotels();
	}
}
