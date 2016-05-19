public class Player{

	private String name;

/**position on board*/
	private int position;

	private int money;

	public Player(String name){
		this.name=name;
	}

	public int getPosition(){
		return position;
	}

	public int getMoney(){
		return money;
	}

	public int addMoney(int amount){
		money+=amount;
	}

	public int loseMoney(int amount){
		money-=amount;
	}

	public void move(int distance){
		position+=distance;
	}
}