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
public class Movie extends Bookmark{
    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;
    
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setCast(String[] cast){
        this.cast = cast;
    }
    public String[] getCast() {
        return cast;
    }
    public void setDirectors(String[] directors){
        this.directors = directors;
    }
    public String[] getDirectors() {
        return directors;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }
    public double getImdbRating() {
        return imdbRating;
    }
}
