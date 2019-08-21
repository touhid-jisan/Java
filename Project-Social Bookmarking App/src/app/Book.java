/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author TouhidulIslam
 */
public class Book extends Bookmark{
    private int publicationYear;
    private String publisher;
    private String[] author;
    private String genre;
    private double amazonRating;
    
    
     public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
     public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setAuthor(String[] author){
        this.author = author;
    }
    public String[] getAuthor() {
        return author;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setAmazonRating(double amazonRating){
        this.amazonRating = amazonRating;
    }
    public double getAmazonRating() {
        return amazonRating;
    }
   
}
