public class Player{
	
	private long bankAccount;
	
	/**array of Tile objects representing properties player owns*/
	private Tile []properties;
	
	/**
	 * @param initialAmount how much money each player starts with
	 */
	public Player(long initialAmount){
		bankAccount=initialAmount;
	}
	
	public long balance(){
		return bankAccount;
	}
	
}