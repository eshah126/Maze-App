//import java.io.*;

public class mazetest {


public mazetest(){
    //. Among other things, this test should load a maze from one of the supplied files, get the neighbours of some specific square (the start square, for example), and assert that (1) there are the correct number of neighbours, and (2) the neighbours are in the correct locations. You probably should do this for
    // the corners and border cases, at least. There should also be a test to print out the maze, and to confirm your getStart and getFinish methods return the correct squares.
 Maze maze1 = new Maze();
 maze1.loadMaze("eshah126/Maze-App/src/maze-1");
 System.out.println(maze1.getStart());
 System.out.println(maze1.getFinish());




 //System.out.println(maze1.reset());
 System.out.println(maze1.toString());


}


}