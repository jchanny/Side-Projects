public class Tile{
	
	private String name;
	
	private int purchaseCost;
	
	//stores whether or not property has already been bought
	private boolean bought;
	
	private int houseCost;
	
	private int hotelCost;
	
	private int mortgageValue;
	
	/**flag that holds whether or not property is mortgaged*/
	private boolean mortgaged; 
	
	private int houseCount;
	
	private int hotelCount;
	
	/**fee for landing on property*/
	private int landingFee;
	
	//the additional fee if there are houses
	private int houseFee;
	
	//the additional fee if there are hotels
	private int hotelFee;
	
	public Tile(String name, int purchaseCost, int houseCost, int hotelCost, int mortgageValue, int landingFee, int houseFee, int hotelFee){
		this.name=name;
		this.purchaseCost=purchaseCost;
		bought=false;
		this.houseCost=houseCost;
		this.hotelCost=hotelCost;
		this.mortgageValue=mortgageValue;
		mortgaged=false;
		houseCount=0;
		hotelCount=0;
		this.landingFee=landingFee;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPurchaseCost(){
		return purchaseCost;
	}
	
	public void buy(){
		bought=true;
	}
	
	public int 	getHouseCost(){
		return houseCost;
	}
	
	public int getHotelCost(){
		return hotelCost;
	}
	
	public int mortgageValue(){
		return mortgageValue;
	}
	
	public boolean isMortgaged(){
		return mortgaged;
	}
	
	/**calculates fee for stepping on property*/
	public int getLandingFee(){
		return landingFee+(houseCount*houseFee)+(hotelCount*hotelFee);
	}
	
}