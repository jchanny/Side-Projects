import java.util.*;
import java.io.*;

/**
 * By Jeremy Chan
 * Minesweeper game, main will run the main program
 */
public class Minesweeper {
    
    private static boolean lostGame;
    
    private static void initialize(int size, int numMines){
        Tile[][]board=new Tile[size][size];
        lostGame=false;
        Random r=new Random(size*size);
        for(int loop=0;loop<board.length;loop++){
            for(int loopy=0;loopy<board[0].length;loopy++){
                board[loop][loopy]=new Tile(null,false,false);
            }
        }

        for(int loopy=0;loopy<numMines;loopy++){
            int x=r.nextInt();
            int y=r.nextInt();
            if(board[x][y].hasMine()==false){
                board[x][y].setMine();
            }
        }
        
        //still need to assign values to tiles surrounding mine
    }
    
    public static void main(String []args){
        initialize(9,2);
    }
    
}