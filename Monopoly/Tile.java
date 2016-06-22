public class Tile{
	
	private final String name;
	
	private final int purchaseCost;
	
	//stores whether or not property has already been bought
	private boolean bought;
	
	private final int mortgageValue;
	
	/**flag that holds whether or not property is mortgaged*/
	private boolean mortgaged; 
	
	/**fee for landing on property*/
	private final int landingFee;
	
	public Tile(String name, int purchaseCost, int mortgageValue, int landingFee){
		this.name=name;
		this.purchaseCost=purchaseCost;
		bought=false;
		this.mortgageValue=mortgageValue;
		mortgaged=false;
		this.landingFee=landingFee;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPurchaseCost(){
		return purchaseCost;
	}
	
	public int getMortgageValue(){
		return mortgageValue;
	}
	
	public boolean isMortgaged(){
		return mortgaged;
	}
	
	public boolean isPurchaseable(){
		return !bought;
	}
	
	public int getLandingFee(){
		return landingFee;
	}
	
}