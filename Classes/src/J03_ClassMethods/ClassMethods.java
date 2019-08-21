/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03_ClassMethods;

/**
 *
 * @author TouhidulIslam
 */
public class ClassMethods {
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating object");
    }
    
    public void myPublicMethod(){
        System.out.println("Public Method can be called by creating objects");
    }
    
    public static void main (String[] args) {
        myStaticMethod();
        
        ClassMethods obj1 = new ClassMethods();
        obj1.myPublicMethod();
    }
}
