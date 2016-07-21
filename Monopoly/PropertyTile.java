
public class PropertyTile extends Tile {
	
	private int houseCost;
	
	private int hotelCost;
	
	private int houseFee;
	
	private int hotelFee;
	
	private int houseCount;

	private int hotelCount;

	public PropertyTile(String name, int purchaseCost, int houseCost, int hotelCost, int mortgageValue, int landingFee, int houseFee, int hotelFee) {
		super(name,purchaseCost, mortgageValue, landingFee);
		this.houseCost=houseCost;
		this.hotelCost=hotelCost;
		this.houseFee=houseFee;
		this.hotelFee=hotelFee;
		houseCount=0;
		hotelCount=0;
	}
	
	public int getLandingFee(){
		return super.getLandingFee()+(houseCount*houseFee)+(hotelCount*hotelFee);
	}
}
