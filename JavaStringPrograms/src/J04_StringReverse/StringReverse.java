/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04_StringReverse;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author TouhidulIslam
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Anything to reverse it");
        String sentence = sc.nextLine();
        Stack stack = new Stack();
        String str = "";
        for(int i=0; i<sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }
        while(!stack.isEmpty()) {
            str = str+stack.pop();
        }
        System.out.println(str);
    }
}
