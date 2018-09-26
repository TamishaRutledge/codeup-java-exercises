package shapes;

//    Shapes extends Rectangle  //
public class Square extends Quadrilateral {

    public Square(int length) {
        super(length,length);
    }

    protected void setLength(int length){
    this.length = length;
}

    protected void setWidth(int width){
    this.width = width;
}

    @Override
    public void setlength(int length) {
    }

    @Override
    public void setwidth(int width) {
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }


//----------------COMMENTING OUT CODE TO PERFORM INTERFACES AND ABSTRACT EXERCISES-----------------//
//    protected int length;
//    protected int width;

//    Square constructor that accepts one argument, should call parent constructor to set the length and width value for side //
//    Super is the same as calling rectangle, so the amount of parameters inside super need to match the number of parameters of rectangle //
//    public Square(int side){
//        super(side, side);

//    }
//--------Overriding rectangle methods----------//
//    public int getArea(){
//        //System.out.println("The Area of the Square is: " + this.length * this.length);
//        return this.length * this.length;
//    }
//
//    public int getPerimeter(){
//        //System.out.println("The Perimeter of the Square is: " + 4 * this.side);
//        return 4 * this.length;
//    }

}
