public class MazeSolverQueue extends MazeSolver
{
    MyQueue<Square> queue;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
        makeEmpty();
        add(maze.getStart());
        System.out.println(maze.getStart());
    }

    
    public void makeEmpty()
    {
        this.queue = new MyQueue<>();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public void add(Square sq)
    {
        this.queue.enqueue(sq);
    }

    public Square next()
    {
        Square sq = this.queue.dequeue();
        return sq;
    }

    public Square nextPeek()
    {
        return queue.front();
    }

}
