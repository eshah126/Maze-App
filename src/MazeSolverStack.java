public class MazeSolverStack extends MazeSolver
{ 
    MyStack<Square> stack;
    public MazeSolverStack(Maze maze)
    {
        super(maze);
        makeEmpty();
        stack.push(maze.getStart());
    }

    
    public void makeEmpty()
    {
        stack = new MyStack<>();
    }

    public boolean isEmpty()
    {
        if(stack.top() == null)
        {
            return true;
        }
        return false;
    }

    public void add(Square sq)
    {
        stack.push(sq);
    }

    public Square next()
    {
        Square sq = stack.pop();
        return sq;
    }

    public Square nextPeek()
    {
        return stack.top();
    }


}

