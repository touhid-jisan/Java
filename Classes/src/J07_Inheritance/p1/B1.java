/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07_Inheritance.p1;

import static java.awt.PageAttributes.MediaType.C2;

/**
 *
 * @author TouhidulIslam
 */
public class B1 {
    public static void main(String[] args) {
       // System.out.println("A1.privateMember : " + A1.privateMember); 
        
        System.out.println("A1.defaultMember : " + A1.defaultMember);      
        System.out.println("C1.defaultMember : " + C1.defaultMember);
       // System.out.println("C2.defaultMember : " + C2.defaultMember);
        
        
        System.out.println("A1.protectedMember : " + A1.protectedMember);      
        System.out.println("C1.protectedMember : " + C1.protectedMember);
       // System.out.println("C2.protectedMember : " + C2.protectedMember);
        
        System.out.println("A1.publicMember : " + A1.publicMember);
        System.out.println("C1.publicMember : " + C1.publicMember);
    }
}
