/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;
    private int minutes;
    private int hours;
    /**
     * Constructor for objects of class Song
     */
    public Movie() 
    {
        rating = 0;
        title = "";
        duration = 0;
    }
    
    public Movie(String title, int rating, int duration) {
        this.title = title; 
        this.rating = rating;
        this.duration = duration;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getRating() {
        return rating; 
    }
    
    public int getDuration() {
        return hours;
    }
    
    
    
    public void setTitle(String t) {
        title = t; 
    }
    
    public void setRating(int r) {
        rating = r;
    }
    
    public void setDuration(int d) {
        hours = (60 % d);
        minutes = (d % 60);
        System.out.println(hours + ":" + minutes);
    }
    
    
}
