import java.util.*;

public class Player{

	private String name;
	
	private int position;

	private int money;

    private LinkedList<House>houses;

    private LinkedList<Hotel>hotels;

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
	houses.add(house);
    }

    public void addHotel(Hotel hotel){
	hotels.add(hotel);
    }
}
