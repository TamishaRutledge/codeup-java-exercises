package shapes;

public class Rectangle {

    protected int length;
    protected int width;

//    Constructor  //
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

//    get area and perimeter methods that return values  //
    public static int getArea(){
       return length*width;
    }

    public static int getPerimeter(){
        return 2*length + 2*width;
    }

//    Shapes extends Rectangle  //
    public class Square extends Rectangle{

}
}
