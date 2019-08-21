package J02_Palindrome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TouhidulIslam
 */
import java.util.Scanner;
import java.util.Stack;


public class J02_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String for palindrome check");
        String wordCheck = sc.nextLine();
        Stack stack = new Stack();
        for(int i=0; i<wordCheck.length(); i++) {
            stack.push(wordCheck.charAt(i));
        }
        String reverseWord = "";
        while(!stack.isEmpty()) {
            reverseWord = reverseWord + stack.pop();
        }
        if(wordCheck.equals(reverseWord)) {
            System.out.println("The Word: " + wordCheck + " is a palindrome word");
        } else {
            System.out.println("The Word: " + wordCheck + " is not a palindrome word");
        }
        
    }
}
