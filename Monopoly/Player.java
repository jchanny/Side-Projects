public class Player{

	private String name;
	
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

	public void addHouse(House house){
		System.out.println("a merge test");
	}

	public void addHotel(Hotel hotel){
		System.out.println("a test");
	}

}