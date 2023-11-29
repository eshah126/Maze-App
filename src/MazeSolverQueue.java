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
        boolean found = false;
        for (int n = 0; n<queue.size();n++){//fixes null pointer error
            if(queue.nextStep.get(n).equals(sq))
                found = true;
        }
        if(!found && !sq.marked){ 
            worklist.enqueue(sq);
        }
    }
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
