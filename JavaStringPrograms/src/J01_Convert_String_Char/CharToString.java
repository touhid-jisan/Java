/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Program to convert string to char
package J01_Convert_String_Char;

/**
 *
 * @author TouhidulIslam
 */
public class CharToString {
    public static void main(String[] args) {
        String name = "jisan";
        //System.out.println(name.charAt(0));
        
        //method 1
        for(int i=0;i<name.length();i++){
            
            System.out.println("Character at "+ i + ", = "+ name.charAt(i));
        }
        
        //method 2
        char[] ch = name.toCharArray();
        for(int i =0;i<ch.length;i++) {
            System.out.println(ch[i]);
        }
    }
}


