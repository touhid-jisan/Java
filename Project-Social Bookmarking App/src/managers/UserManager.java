/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import app.User;

/**
 *
 * @author TouhidulIslam
 */
public class UserManager {
    private static UserManager instance = new UserManager();
    private UserManager() { };
    public static UserManager getInstance() {
        return instance; 
    }
    
    public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType ) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);       
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUserType(userType);
        
        return user;
    } 
}
