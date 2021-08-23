package abhinav.moviecatalogueapi.templates;

public class mtemplate {
    private String movieid;
    private String name;

    // default constructor
    public mtemplate(){
    }

    public mtemplate(String movieid, String name) {
        this.movieid = movieid;
        this.name = name;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
