public class Tile{
	
    /**name of the space*/
	private String name;

	private int houses;

	private int hotels;

    /**cost to add a house*/
	private final int houseValue;

    /**cost to add a hotel*/
	private final int hotelValue;

    private final int housePenalty;

    private final int hotelPentaly;

    public Tile(String name, int houseValue, int hotelValue, boolean specialSpace,int housePenalty,
		int hotelPenalty){
		this.name=name;
		houses=0;
		hotels=0;
		if(specialSpace==true){
		    this.houseValue=houseValue;
		    this.hotelValue=hotelValue;
		}
		this.housePenalty=housePenalty;
		this.hotelPenalty=hotelPenalty;
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

    public int fine(){
	return (housePenalty*numHouses)+(hotelPenalty*numHotels);
    }
}
