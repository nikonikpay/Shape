package ShapeOpdracht;

public class Rectangle extends Shape {


    private static int count;
    public final int ANGLES = 4;

    private int height;
    private int width;


    public Rectangle() {
      this(0, 0);

    }


    public Rectangle(int height, int width) {
        this(height,width,0,0);
    }

    public Rectangle(int height, int width,int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        count++;
    }

    public Rectangle(Rectangle rectangle) {
       this(rectangle.getWidth(),rectangle.getHeight(),rectangle.getX(),rectangle.getY());

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        boolean lengthIsNegative = height < 0 ;
        if (lengthIsNegative) {
            this.height = -height;
        }else{
            this.height = height;
        }


    }


    public void setWidth(int width) {

        boolean widthIsNegative = width < 0;
        if (widthIsNegative) {
            this.width = -width;
        } else {
            this.width = width;
        }

    }

    @Override
    public double getArea() {
        int area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {

        int perimeter = 2 * (this.width + this.height);
        return perimeter;
    }

    public void grow(int growing) {
        setHeight(height * growing);
        setWidth(width * growing);
    }


    public static int getCount() {
        return count;
    }


}
