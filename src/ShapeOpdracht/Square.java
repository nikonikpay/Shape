package ShapeOpdracht;

public class Square extends Rectangle {

    private static int count;
    {
        count++;
    }

    public Square() {
        this(1);

    }

    public Square(int side) {
        this(side,0,0);

    }

    public Square( int side,int x, int y) {
        super(side,side,x,y);
    }

    public Square(Square square) {

        super(square);

    }


    public int getSide() {

        return getHeight();

    }

    public void setSide(int side) {

            super.setHeight(side);
            super.setWidth(side);

    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }


    public static int getCount() {
        return count;
    }


}
