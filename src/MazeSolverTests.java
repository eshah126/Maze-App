import java.util.Scanner;
import java.io.*;

public class MazeSolverTests
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Scanner scan = new Scanner(new File("src\\maze-1.txt"));
        Maze maze1 = new Maze();
        maze1.loadMaze("src\\maze-1.txt");
        MazeSolverStack stackSolveing = new MazeSolverStack(maze1);
        
        stackSolveing.makeEmpty();
        
    }
}