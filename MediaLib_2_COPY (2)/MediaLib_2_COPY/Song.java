
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite; 
    /**
     * Constructor for objects of class Song
     */
    public Song() 
    {
        rating = 0;
        title = "";
        price = 0.0;
    }
    
    public Song(String title, double price) {
        this.title = title; 
        this.price = price; 
    }
    
    public Song(String title, double price, int rating) {
        this.title = title; 
        this.price = price; 
        this.rating = rating;
    }
    
    //Accessors
    public String getTitle() {
        return title;
    }
    public int getRating() {
        return rating; 
    }
    public double getPrice() {
        return price; 
    }
    public boolean getFavorite() {
        return favorite; 
    }
    
    //Mutators
    public void setTitle(String t) {
        title = t; 
    }
    public void setRating(int r) {
        rating = r;
    }
    public void setPrice(double p) {
        price = p;
    }
    
    public void addToFavorites() {
        favorite = true;
    }
    public void removeFromFavorites() {
        favorite = false;
    }
}
