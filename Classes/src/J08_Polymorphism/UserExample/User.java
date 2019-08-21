/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08_Polymorphism.UserExample;

/**
 *
 * @author TouhidulIslam
 */ 
public class User {
    public void printUserType() {
        System.out.println("User");
    }
    public void saveWebLink() {
        System.out.println("User : saveWebLink");
        postAReview();
    }
    public void postAReview() {
        System.out.println("User : postAReview");
    }
}
