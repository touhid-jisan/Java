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
public class Bookmark {
    private long id;
    private String title;
    private String profileUrl;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
     public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
     public String getProfileUrl() {
        return profileUrl;
    }
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
