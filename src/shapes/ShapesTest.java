package shapes;


public class ShapesTest {

    public static void main(String[] args){

        Quadrilateral box1 = new Rectangle(5,4);
        System.out.println("The Perimeter of the Rectangle is: " + box1.getPerimeter());
        System.out.println("The Area of the Rectangle is: " + box1.getArea());

        Quadrilateral box2 = new Square(5);
        System.out.println("The Perimeter of the Square is: " + box2.getPerimeter());
        System.out.println("The Area of the Square is: " + box2.getArea());
//        System.out.println("The Area of the Square is: " + Square.getArea(box2));


        Measurable myShape = new Rectangle(5,4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


        myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}
