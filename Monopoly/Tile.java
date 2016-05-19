public class Tile{
	
	private String name;

	private int houses;

	private int hotels;

	private final int houseValue;

	private final int hotelValue;

	public Tile(String name, int houseValue, int hotelValue){
		this.name=name;
		houses=0;
		hotels=0;
		this.houseValue=houseValue;
		this.hotelValue=hotelValue;
	}

	public void addHouses(int numHouses){
		houses+=numHouses;
	}

	public void addHotels(int numHotels){
		hotels+=numHotels;

	}

	public void sellHouse(int numHouses){
		houses=houses-numHouses;

	}

	public void sellHotel(int numHotels){
		hotels=hotels-numHotels;
	}

}