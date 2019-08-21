/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05_BubbleSortStringInArray;

/**
 *
 * @author TouhidulIslam
 */
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        String[] arrStr = {"Ford " , "Lexus ", "Mercedes-Benz", "BMW" , "Audi", "Prosche"};
        String temp = "";
        for(int i=0; i<arrStr.length; i++) {
            for(int j=i+1; j<arrStr.length; j++) {
                if(arrStr[i].compareTo(arrStr[j]) > 0) {
                    temp = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp;
                }               
            }
            System.out.println(arrStr[i]);
        }
        System.out.println(Arrays.asList(arrStr));
    }
}
