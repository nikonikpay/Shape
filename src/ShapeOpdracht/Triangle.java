package ShapeOpdracht;

public class Triangle extends Shape {

    public final int ANGLES = 3;


    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle() {
        this(0, 0, 0);
    }

    public Triangle(int height, int width, int perpendicular) {
        this(0, 0, height, width, perpendicular);
    }

    public Triangle(int x, int y, int height, int width, int perpendicular) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle) {


        this(triangle.getX(), triangle.getY(), triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular());


    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {

        return (width * perpendicular) / 2;
    }


    @Override
    public double getPerimeter() {


        double powerThirdHook = Math.pow(this.width, 2) + Math.pow(this.height, 2);
        double thirdHook = Math.sqrt(powerThirdHook);


            if( (thirdHook+width)> height && (height+width)> thirdHook && (height+thirdHook)> width){
                double perimeter = thirdHook + width + height;
                return perimeter;
            }

            System.out.println(" make sure that you put the right numbers ");


            return -1;


    }



    public static int getCount() {
        return count;
    }


}
