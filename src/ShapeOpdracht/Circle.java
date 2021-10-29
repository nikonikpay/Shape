package ShapeOpdracht;

public class Circle extends Shape {

    public int ANGLES = 0;

    private static int count;
    private int radius;


    public Circle() {
      this(0);

    }

    public Circle(int radius) {
        this(0,0,radius);
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle){


        this(circle.getX(),circle.getY(),circle.getRadius());

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }


    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void grow(int growing){

        setRadius(radius * growing);

    }


    public static int getCount() {
        return count;
    }



}
