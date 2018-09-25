package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public int setlength(int length) {
        return 0;
    }

    @Override
    public int setwidth(int width) {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
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
