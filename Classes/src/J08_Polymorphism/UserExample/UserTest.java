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
public class UserTest {
    public void printUserType(User u) {
        u.printUserType();
    }
    
    public static void main (String[] args) {
        // part 1
        User user = new User();
        User staff = new Staff();
        User editor = new Editor();
        
        
        UserTest ut = new UserTest(); 
        ut.printUserType(user);
        ut.printUserType(staff);
        ut.printUserType(editor);
        
        //part 2
        //editor.approveReview(); //won't work because refference is USER not editor
        //editor.postAReview();
        editor.saveWebLink();
    }
}