public class MazeSolverQueue extends MazeSolver
{
    
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
    }

    MyQueue<Square> queue;
    public void makeEmpty()
    {
        queue = new MyQueue<>();
    }

    public boolean isEmpty()
    {
        if(this.queue.front() == null)
        {
            return true;
        }
        return false;
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


}
