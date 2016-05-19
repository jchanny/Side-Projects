
public class Tile {

	private boolean hasMine;
	private boolean hasFlag;
	
	public Tile(boolean hasMine, boolean hasFlag){
		this.hasMine=hasMine;
		this.hasFlag=hasFlag;
	}
	
	public boolean hasMine(){
		return hasMine;
	}
	
	public void addMine(){
		hasMine=true;
	}
	
	public void setFlag(){
		if(hasFlag==true)
			hasFlag=false;
		else
			hasFlag=true;
	}
	
	public boolean hasFlag(){
		return hasFlag;
	}
	
	
}
