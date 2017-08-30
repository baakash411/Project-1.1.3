
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{   
    public static void main (String[] args) 
    {   
        System.out.println("Welcome to your Media Library!");
        
        Song song1 = new Song();
        System.out.println(song1);
        
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        
        song1.setRating(10);
        System.out.println(song1.getRating());
        
        song1.setPrice(0.99);
        System.out.println(song1.getPrice());
        
        //Song(title, price, rating)
        
        double totalCost = 0;
        int numSongs = 0;
        int totalRatings = 0;
        double averageCost;
        double averageRating; 
        
        System.out.println(totalCost);
        System.out.println(numSongs);
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song 2
        Song song2 = new Song("Song2", 2.99, 10);
        
        totalCost = totalCost + song2.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song2.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song3
        Song song3 = new Song("Song3", 1.29, 10);
        
        totalCost = totalCost + song3.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song3.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song4
        Song song4 = new Song("Song4", 0.99, 8);
        
        totalCost = totalCost + song4.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song4.getRating();
        System.out.println(totalRatings);
        
        //Song5
        Song song5 = new Song("Song5", 1.29, 9);
        
        totalCost = totalCost + song5.getPrice();
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song5.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song6
        Song song6 = new Song("Song6", 2.00, 9);
        
        totalCost = totalCost + song6.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song6.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song7
        Song song7 = new Song("Song7", 1.50, 9);
        
        totalCost = totalCost + song7.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song7.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        //Song8
        Song song8 = new Song("Song8", 1.28, 9);
        
        totalCost = totalCost + song8.getPrice();
        System.out.println(totalCost);
        numSongs = numSongs + 1;
        System.out.println(numSongs);
        totalRatings = totalRatings + song8.getRating();
        System.out.println(totalRatings);
        System.out.print("\n");
        
        averageCost = (totalCost / numSongs);
        System.out.println(averageCost);
        averageRating = (1.0 * totalRatings / numSongs);
        System.out.println(averageRating);
        
        Movie movie1 = new Movie();
        
        movie1.setDuration(97);
        System.out.println(movie1.getDuration());
    }
}
