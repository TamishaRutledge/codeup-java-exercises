package shapes;

public class Rectangle {

    protected int length;
    protected int width;

//-------------------------------Constructor-------------------------------------------//
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

//-------------------------------Getters and Setters-----------------------------------//
    public int getLength() {
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
//--------------------------get area and perimeter methods that return values-------------------//
    public int getArea(){
       return this.length * this.width;
    }

    public int getPerimeter(){
        return 2*this.length + 2*this.width;
    }


}