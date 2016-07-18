
public class PropertyTile extends Tile {

	private int houseCost;

	private int houseFee;

	private int hotelFee;

	public PropertyTile(String name, int purchaseCost, int houseCost, int mortgageValue, int landingFee, int houseFee,
			int hotelFee) {
		super(name, purchaseCost, mortgageValue, landingFee, houseCost);
		this.houseCost = houseCost;
		this.houseFee = houseFee;
		this.hotelFee = hotelFee;
	}

	/**
	 * rent price for 1st house: rent*5, rent price for 2nd house: rent 1st
	 * house*3 rent price 3rd house: rent 2nd house*3 rent price 4th house:
	 * can't figure out rent price for 1 hotel: landingFee*50
	 */
	public int getLandingFee() {

		return super.getLandingFee() + (super.numHouses() * houseFee) + (super.numHotels() * hotelFee);
	}

}
