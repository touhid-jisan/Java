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
public class UserBookmark {
    private User user;
    private Bookmark bookmark;
    
    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }
    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }
    public Bookmark getBookmark() {
        return bookmark;
    }
}
