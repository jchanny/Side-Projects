import java.util.*;

public class Minesweeper {
	
	public static void initialize(int size, int difficulty){
		Tile [][] board=new Tile[size][size];
		for(int loop=0;loop<board.length;loop++){
			for(int loopy=0;loopy<board[0].length;loopy++){
				board[loopy][loopy]=new Tile(false, false);
			}
		}
		Random r=new Random();
		
		//change later, right now just setting #mines to=sqrt(size)
		int mines=size;
		
		//adding mines to board
		for(int loop=0;loop<mines;loop++){
			int x=r.nextInt(size-1);
			int y=r.nextInt(size-1);
			if(board[y][x].hasMine()==false)
				board[y][x].addMine();
		}
	}
	
	public static void draw(Graphics g){
		
	}
	
	public static void main(String[]args){
		initialize(9,1);
	}
}
