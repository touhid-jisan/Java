/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03_SortStringsInAlphabeticalOrder;

/**
 *
 * @author TouhidulIslam
 */
import java.util.Scanner;
public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); // if we use here sc instead of sc2 , first index str[] will be occupied 
        //int [] a = new int[5];  
        System.out.println("How Many String?");
        int count = sc.nextInt();
        String str[] = new String[count];
        System.out.println("Enter Strings One by One to Sort");
        for(int i=0;i<count;i++) {
            str[i]= sc2.nextLine();
        }
        String temp ="";
        for(int i=0; i<count;i++) {
            for (int j=0; j<count ; j++) {
                if(str[i].compareTo(str[j])>0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        for(int i=0; i<count ; i++) {
            System.out.println(str[i]);
        } 
        /*
        for(String s: str) {
            System.out.println(s);
        }
        */
    } 
}
