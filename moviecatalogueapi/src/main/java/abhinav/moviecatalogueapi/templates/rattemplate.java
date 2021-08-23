package abhinav.moviecatalogueapi.templates;

public class rattemplate {
    private String mid;
    private int rating;

    public rattemplate(){

    }

    public rattemplate(String mid, int rating) {
        this.mid = mid;
        this.rating = rating;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
