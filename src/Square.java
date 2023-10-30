public class Square
{
    private int Row;
    private int Col;
    private int Type;
    public Square(int row, int col, int type)
    {
        this.Row=row;
        this.Col=col;
        this.Type=type;
    }

    public int getRow()
    {
        return this.Row;
    }
    public int getCol()
    {
        return this.Col;
    }
    public int getType()
    {
        return this.Type;
    }

    public String toString()
    {
        int key = this.Type;
        String out = null;
        out = getRow()+" "+getCol()+" "+getType()+" ";
        switch (key) {
            case 0:
                out += "_";
                break;
            case 1:
                out += "#";
                break;
            case 2:
                out += "S";
                break;
            case 3:
                out += "E";
                break;
            default:
                out += "ERROR";
                break;
        }
        
        return out;
    }
}
