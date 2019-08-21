/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import Constants.BookGenre;
import Constants.Gender;
import Constants.MovieGenre;
import Constants.UserType;
import app.Bookmark;
import app.User;
import app.UserBookmark;
import managers.BookMarkManagers;
import managers.UserManager;


/**
 *
 * @author TouhidulIslam
 */
public class DataStore {
    private static final int USER_BOOKMARK_LIMIT = 5;
    private static final int BOOKMARK_COUNT_PER_TYPE = 5;
    private static final int BOOKMARK_TYPES_COUNT = 3;
    private static final int TOTAL_USER_COUNT = 5;
    
    
    private static User[] users = new User[TOTAL_USER_COUNT];
    private static Bookmark[] [] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
    private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
    
    
    private static User[] gertUSers() {
        return users;
    }
    private static Bookmark[] []getBookmark() {
        return bookmarks;
    }
    
    public static void loadData() {
        loadUsers();
        loadWebLinks();
        loadMovies();
        loadBooks();
    }
    
    public static void loadUsers() {
        users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M", Gender.MALE, UserType.USER);  				
        users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "Sam", "M", Gender.MALE, UserType.USER);  				
        users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "Anita", "M", Gender.MALE, UserType.EDITOR);  				
        users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com", "test", "Sara", "M", Gender.MALE, UserType.EDITOR);  				
        users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com", "test", "Dheeru", "M", Gender.MALE, UserType.CHIEF_EDITOR);  				
    }
    public static void loadWebLinks() {
        bookmarks [0] [0] = BookMarkManagers.getInstance().createWebLink(2000,	"Taming Tiger, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
        bookmarks [0] [1] = BookMarkManagers.getInstance().createWebLink(2001,	"How do I import a pre-existing Java project into Eclipse and get up and running?",	"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "http://www.stackoverflow.com");
        bookmarks [0] [2] = BookMarkManagers.getInstance().createWebLink(2002,	"Interface vs Abstract Class",	"http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com");
        bookmarks [0] [3] = BookMarkManagers.getInstance().createWebLink(2003,	"NIO tutorial by Greg Travis",	"http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu");
        bookmarks [0] [4] = BookMarkManagers.getInstance().createWebLink(2004,	"Virtual Hosting and Tomcat",	"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org");

    }

    private static void loadMovies() {
       bookmarks [1] [0] = BookMarkManagers.getInstance().createMovie(3000, "Citizen Kane","", 1941, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
       bookmarks [1] [1] = BookMarkManagers.getInstance().createMovie(3001, "Md  Jisan","", 1541, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
       bookmarks [1] [2] = BookMarkManagers.getInstance().createMovie(3002, "Nas Daily","", 1441, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
       bookmarks [1] [3] = BookMarkManagers.getInstance().createMovie(3003, "No One","", 1241, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
       bookmarks [1] [4] = BookMarkManagers.getInstance().createMovie(3004, "Name ","", 1931, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.CLASSICS,	8.5);
    }

    private static void loadBooks() {
      bookmarks [2] [0] = BookMarkManagers.getInstance().createBook(4000, "Walden", 1854 , "Wilder Publications",  new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
      bookmarks [2] [1] = BookMarkManagers.getInstance().createBook(4001, "Self-Reliance and Other Essays", 1993 , "Dover Publications",  new String[] {"Ralph Waldo Emerson"}, BookGenre.PHILOSOPHY,	4.5);
      bookmarks [2] [2] = BookMarkManagers.getInstance().createBook(4002, "Light From Many Lamps", 1988 , "Wilder Publications",  new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
      bookmarks [2] [3] = BookMarkManagers.getInstance().createBook(4003, "Head First Design Patterns", 2004 , "Wilder Publications",  new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
      bookmarks [2] [4] = BookMarkManagers.getInstance().createBook(4004, "Effective Java Programming Language Guide", 2007 , "Wilder Publications",  new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
    }
    
}
