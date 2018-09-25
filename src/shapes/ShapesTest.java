package shapes;


public class ShapesTest {

    public static void main(String[] args){

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };





//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("The Perimeter of the Rectangle is: " + box1.getPerimeter());
//        System.out.println("The Area of the Rectangle is: " + box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println("The Perimeter of the Square is: " + box2.getPerimeter());
//        System.out.println("The Area of the Square is: " + box2.getArea());
//        System.out.println("The Area of the Square is: " + Square.getArea(box2));


    }
}
