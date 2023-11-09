public class MazeSolverTests 
{
    public static void main(String[] args)
    {
        Maze maze1 = new Maze();
        maze1.loadMaze("Maze-App\\src\\maze-1.txt");
        MazeSolverQueue queueSolve = new MazeSolverQueue(maze1);
        queueSolve.add(maze1.getStart());
        System.out.println(queueSolve.isEmpty());
        //queueSolve.solve();
        System.out.println("h");
        System.out.println(queueSolve.step());
        //System.out.println(queueSolve.getPath());

        /*
        Maze maze2 = new Maze();
        maze1.loadMaze("Maze-App\\src\\maze-2.txt");
        MazeSolverQueue queueSolve2 = new MazeSolverQueue(maze2);
        queueSolve2.add(maze2.getStart());
        System.out.println(queueSolve2.isEmpty());
        queueSolve2.solve();
        System.out.println(queueSolve2.getPath());

        Maze maze3 = new Maze();
        maze3.loadMaze("Maze-App\\src\\maze-3.txt");
        MazeSolverStack stackSolve = new MazeSolverStack(maze3);
        stackSolve.add(maze3.getStart());
        System.out.println(stackSolve.isEmpty());
        stackSolve.solve();
        System.out.println(stackSolve.getPath());

        Maze maze4 = new Maze();
        maze4.loadMaze("Maze-App\\src\\maze-4.txt");
        MazeSolverStack stackSolve2 = new MazeSolverStack(maze4);
        stackSolve.add(maze4.getStart());
        System.out.println(stackSolve2.isEmpty());
        stackSolve.solve();
        System.out.println(stackSolve2.getPath());
        */
    }
}
