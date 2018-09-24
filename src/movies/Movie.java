package movies;

public class Movie {

    private String name;
    private String category;


//ARE THESE CONSTRUCTORS ON THOSE ^^^^ PRIVATE FIELDS??????//
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


//    GETTERS AND SETTERS NEEDED  //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

// Don't think I need this main on this class//
//    public static void main(String[] args) {
//
//    }



}
