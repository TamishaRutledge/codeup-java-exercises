package shapes;

    public abstract class Quadrilateral extends Shape implements Measurable{

        protected int length;
        protected int width;
//-------------------CONSTRUCTOR TAKING IN 2 NUMBERS FOR LENGTH AND WIDTH-----------------//
        public Quadrilateral(int length, int width){
            this.length = length;
            this.width = width;
        }
//-------------------GETTERS TO OBTAIN THE LENGTH AND WIDTH-------------------------------//
        public int getLength(){
            return this.length;
        }
        public int getWidth(){
            return this.width;
        }
//-------------------ABSTRACT METHODS FOR SETTING THE LENGTH AND WIDTH---------------------//
        public abstract void setlength(int length);
        public abstract void setwidth(int width);
    }
