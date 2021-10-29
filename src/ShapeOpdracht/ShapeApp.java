package ShapeOpdracht;

import ShapeOpdracht.IsoScelesTriangle;

public class ShapeApp {

    public static void main(String[] args) {

        //ShapeOpdracht.Rectangle
        Rectangle myRectangle = new Rectangle();

        myRectangle.setHeight(10);
        myRectangle.setWidth(30);


        System.out.println("Area of ShapeOpdracht.Rectangle\n" + myRectangle.getArea());
        System.out.println("Perimeter of ShapeOpdracht.Rectangle\n" + myRectangle.getPerimeter());
        System.out.println("Height of ShapeOpdracht.Rectangle is\n" + myRectangle.getHeight()  +"\nWidth of rectangle is\n"+ myRectangle.getWidth());

        myRectangle.grow(10);
        System.out.println("Area of ShapeOpdracht.Rectangle after growing is\n" + myRectangle.getArea());
        System.out.println("Perimeter of ShapeOpdracht.Rectangle after growing is\n" + myRectangle.getPerimeter());
        System.out.println("Height of ShapeOpdracht.Rectangle after growing\n" + myRectangle.getHeight() +"\nWidth of rectangle after growing is\n"+ myRectangle.getWidth());



        //ShapeOpdracht.Square
        Square mySquare = new Square();
        mySquare.setSide(20);

        System.out.println("Area of ShapeOpdracht.Square is \n" + mySquare.getArea());
        System.out.println("Perimeter of ShapeOpdracht.Square is \n" + mySquare.getPerimeter());
        System.out.println("Height of ShapeOpdracht.Square is \n" + mySquare.getHeight()  +"\nWidth of ShapeOpdracht.Square is\n"+ mySquare.getWidth());



        // ShapeOpdracht.Circle
        Circle myCircle = new Circle();
        myCircle.setRadius(20);

        System.out.println("Area of ShapeOpdracht.Circle is\n" + myCircle.getArea());
        System.out.println("Perimeter of ShapeOpdracht.Circle is\n" + myCircle.getPerimeter());
        System.out.println("The Radius of ShapeOpdracht.Circle is\n" + myCircle.getRadius());



        // ShapeOpdracht.Triangle
        Triangle myTriangle = new Triangle();
        myTriangle.setHeight(10);
        myTriangle.setWidth(20);
        myTriangle.setPerpendicular(15);

        System.out.println("Area of ShapeOpdracht.Triangle is\n" + myTriangle.getArea());
        System.out.println("Perimeter of ShapeOpdracht.Triangle is\n" + myTriangle.getPerimeter());
        System.out.println("The Height of ShapeOpdracht.Triangle is\n" + myTriangle.getHeight() +"\nThe width of triangle is\n" + myTriangle.getWidth()+"\nThe perpendicular of ShapeOpdracht.Triangle is\n" +myTriangle.getPerpendicular());



        //Iso Triangle
        IsoScelesTriangle myIso = new IsoScelesTriangle();
        myIso.setWidth(19);
        myIso.setHeight(10);
        System.out.println(myIso.getPerimeter());

    }

}
