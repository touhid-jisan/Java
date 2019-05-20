/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// includes business logic related to bokmark
// managers classes doesnt use static class
package managers;

import app.Book;
import app.Movie;
import app.WebLink;

/**
 *
 * @author TouhidulIslam
 */
public class BookMarkManagers {
     private static BookMarkManagers instance = new BookMarkManagers();
    private BookMarkManagers() { };
    public static BookMarkManagers getInstance() {
        return instance; 
    }
    
    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
        Movie movie = new Movie();
        
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        
        return movie;
    }
    
    public Book createBook(long id, String title, int publicationYear, String publisher, String[] author, String genre, double amazonRating) {
        Book book = new Book();
        
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);
        
        return book;    
    }
    
    public WebLink createWebLink(long id, String title, String url, String host ) {
        WebLink webLink = new WebLink();
        
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);
        
        return webLink;
    }
}
