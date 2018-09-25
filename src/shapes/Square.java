package shapes;

//    Shapes extends Rectangle  //
public class Square extends Rectangle{

//    protected int length;
//    protected int width;

//    Square constructor that accepts one argument, should call parent constructor to set the length and width value for side //
//    Super is the same as calling rectangle, so the amount of parameters inside super need to match the number of parameters of rectangle //
    public Square(int side){
        super(side, side);

    }
//--------Overriding rectangle methods----------//
    public int getArea(){
        //System.out.println("The Area of the Square is: " + this.length * this.length);
        return this.length * this.length;
    }

    public int getPerimeter(){
        //System.out.println("The Perimeter of the Square is: " + 4 * this.side);
        return 4 * this.length;
    }

}
