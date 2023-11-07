public class MazeSolverStack extends MazeSolver
{ 
    public MazeSolverStack(Maze maze)
    {
        super(maze);
    }

    MyStack<Square> stack;
    public void makeEmpty()
    {
        stack = new MyStack<>();
    }

    public boolean isEmpty()
    {
        if(this.stack.top() == null)
        {
            return true;
        }
        return false;
    }

    public void add(Square sq)
    {
        this.stack.push(sq);
    }

    public Square next()
    {
        Square sq = this.stack.pop();
        return sq;
    }


}

