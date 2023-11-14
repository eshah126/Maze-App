import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Maze {
    private Square[][] maze;
    private int numRows = 0;
    private int numCols = 0;
    //based off recomendation from Will Wang
    private Square beginning;
    private Square end;

    public Maze()
    {
    }

    public boolean loadMaze(String fName)
    {
        
        try
        {
        Scanner scan = new Scanner(new File(fName));
        
        
        numRows = scan.nextInt();
        numCols = scan.nextInt();
	    this.maze = new Square[numRows][numCols];
        for (int row=0; row < numRows; row++) 
         {
                for (int col=0; col < numCols; col++)
                {
     	    		int squareData = scan.nextInt();
                    maze[row][col] = new Square(row, col, squareData);
                    if(squareData==2)
                    {
                        beginning= maze[row][col];
                        System.out.println(beginning);
                    }
                    if(squareData==3)
                    {
                        end= maze[row][col];
                    }
    	    	}
         }

	    return true;
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            return false;
        }
        
    }
    
    public ArrayList<Square> getNeighbors(Square sq)
    {
        int col = sq.getCol();
        int row = sq.getRow();
        int left = col-1;
        int right = col+1;
        int up = row-1;
        int down = row+1;
	    ArrayList<Square> neighbors = new ArrayList<>();
        if(maze[row][left]!=null)
	        neighbors.add(maze[row][left]);
        if(maze[row][right]!=null)
            neighbors.add(maze[row][right]);
       if(maze[down][col]!=null)
            neighbors.add(maze[down][col]);
        if(maze[up][col]!=null)
            neighbors.add(maze[up][col]);
        System.out.println("You found the neighbors!");
        return neighbors;
    }

    public Square getStart()
    {

       return beginning;

    }

    public Square getFinish()
    {

        return end;
    }

    public void reset()
    {
        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		if(this.maze[row][col].getType()==3)
                    {
                        this.maze[row][col].resetSquare();
                    }
    	    	}
         }
    }

    public String toString()
    {
        String out = "";
        for (int row=0; row < numRows; row++) 
         {
    	    	for (int col=0; col < numCols; col++)
                {
     	    		
                    
                        out+=this.maze[row][col].getType();
                    
    	    	}
                out+="\n";
         }
         return out;
    }
}


