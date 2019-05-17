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
public class Staff extends User  {
    public void printUserType() {
        System.out.println("Staff");
    }
    public void postAReview() {
        System.out.println("Staff : postAReview");
    } 
}
