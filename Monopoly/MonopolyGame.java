import java.awt.*;
import javax.swing.*;

public class MonopolyGame extends JPanel{
	private static Tile []board;


	public static void initialize(){
	  board=new Tile[40];
	   //board[0]=go
	   //board[31]=jail
	   board[1]=new PropertyTile("Mediterranean Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[2]=new PropertyTile("Community Chest", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[3]=new PropertyTile("Baltic Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[6]=new PropertyTile("Oriental Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[7]=new PropertyTile("Chance", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[8]=new PropertyTile("Vermont Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[9]=new PropertyTile("Conneticut Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[11]=new PropertyTile("St.Charles Place", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[12]=new PropertyTile("Electric Company", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[13]=new PropertyTile("States Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[14]=new PropertyTile("Virginia Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[15]=new PropertyTile("Pennysylvania Railroad", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[16]=new PropertyTile("St. James Place", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[18]=new PropertyTile("Tennesse Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[19]=new PropertyTile("New York Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[21]=new PropertyTile("Kentucky Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[22]=new PropertyTile("Chance", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[23]=new PropertyTile("Indiana Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[24]=new PropertyTile("Illinois Ave", 0, 0, 0, 0, 0, 0, 0 );
	   board[26]=new PropertyTile("Atlantic Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[27]=new PropertyTile("Ventnor Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[29]=new PropertyTile("Marvin Gardens", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[31]=new PropertyTile("Pacific Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[32]=new PropertyTile("North Carolina Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[34]=new PropertyTile("Pennysylvania Ave", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[37]=new PropertyTile("Park Place", 0, 0, 0, 0, 0, 0, 0 ); 
	   board[39]=new PropertyTile("Boardwalk", 0, 0, 0, 0, 0, 0, 0); 
	   JFrame window=new JFrame();
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setSize(1000,1000);
	   //board[4]=new Tile("Income Tax", 0, 0, 0, 0, 0, 0, 0 ); 
		 //  board[5]=new Tile("Reading Railroad", 0, 0, 0, 0, 0, 0, 0 ); 
		//   board[10]=new Tile("Jail", 0, 0, 0, 0, 0, 0, 0 ); 
//	   board[17]=new Tile("Community Chest", 0, 0, 0, 0, 0, 0, 0 ); 
//	   board[20]=new Tile("Free Parking", 0, 0, 0, 0, 0, 0, 0 ); 
		//   board[25]=new Tile("B & O RR", 0, 0, 0, 0, 0, 0, 0 ); 
		//   board[28]=new Tile("Water Works", 0, 0, 0, 0, 0, 0, 0 ); 
	   //board[31]jail
		  // board[33]=new Tile("Community Chest", 0, 0, 0, 0, 0, 0, 0 ); 
		  // board[35]=new Tile("Short Line RR", 0, 0, 0, 0, 0, 0, 0 ); 
		//   board[36]=new Tile("Chance", 0, 0, 0, 0, 0, 0, 0 ); 
		 //  board[38]=new Tile("Luxury Tax", 0, 0, 0, 0, 0, 0, 0 ); 
	   
	   //drawing the board
	   
	   window.getContentPane().add(new MonopolyGame());
	   
	   window.setVisible(true);
	}

	public void paint (Graphics g){
		g.drawRect(0, 0, 125, 125); //go
		g.drawRect(0, 1000-250, 125, 125); //jail
		g.drawRect(1000-145, 0, 125, 125);//park
		g.drawRect(1000-145, 1000-250, 125, 125);//go to jail
		int xDim=0;
		int yDim=0;
	}
	
	public static void main(String []args){
		initialize();
	}
	
}