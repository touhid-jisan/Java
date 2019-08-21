/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Program to convert char to String
package J01_Convert_String_Char;

/**
 *
 * @author TouhidulIslam
 */
public class StringToChar {
    public static void main(String[] args){
        // method 1
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is" + str);
        
        //method 2
        char cha = 'b';
        String st = String.valueOf(cha);
        System.out.println("String is: " + st);
    }
}
