import javax.swing.*;
import java.awt.*;

public class ConnectFour extends JPanel{
	
	public void paint(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillRect(0,0,700,600);
		for(int loop=0;loop<600)
		
	}
	
	public static void initialize(){
		//have a "grid" of jbuttons that represents slots for pieces
		JButton [][]grid=new JButton[6][7];
		JFrame frame=new JFrame();
		frame.setSize(700, 600);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().add(new ConnectFour());
		frame.setTitle("Connect Four!");
		frame.setVisible(true);
	}
	
	public static void main(String[]args){
		initialize();
	}
}
