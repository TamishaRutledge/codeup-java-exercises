package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setlength(int length) {
        this.length = length;
    }

    @Override
    public void setwidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width + this.length);
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }


//----------------COMMENTING OUT CODE TO PERFORM INTERFACES AND ABSTRACT EXERCISES-----------------//
//    protected int length;
//    protected int width;

//-------------------------------Constructor-------------------------------------------//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }

//-------------------------------Getters and Setters-----------------------------------//
//    public int getLength() {
//        return this.length;
//    }
//    public int getWidth(){
//        return this.width;
//    }
//
//    public void setLength(int length){
//        this.length = length;
//    }
//    public void setWidth(int width){
//        this.width = width;
//    }
//--------------------------get area and perimeter methods that return values-------------------//
//    public int getArea(){
//       return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return 2*this.length + 2*this.width;
//    }


}
