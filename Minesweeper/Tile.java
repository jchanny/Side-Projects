public class Tile{
    
    private Integer value;
    
    private boolean flag;
    
    private boolean mine;
    
    public Tile(Integer value, boolean flag, boolean mine){
        this.value=value;
        this.flag=flag;
        this.mine=mine;
    }
    
    public Integer getValue(){
        return value;
    }
    
    public boolean hasFlag(){
        return flag;
    }
    
    public boolean hasMine(){
        return mine;
    }
    
    /**adds mine to tile*/
    public void setMine(){
        if(mine!=true)
            mine=true;
    }
    
    /**adds flag to tile*/
    public void setFlag(){
        if(flag!=true)
            flag=true;
    }

	public void doesNothing(){
	}
}
