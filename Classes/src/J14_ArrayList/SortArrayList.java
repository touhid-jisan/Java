/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J14_ArrayList;

/**
 *
 * @author TouhidulIslam
 */
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<String> myString = new ArrayList<String>();
        myString.add("Volvo");
        myString.add("BMW");
        myString.add("Ford");
        myString.add("Mazda");
        Collections.sort(myString);
        for(String i : myString){
            System.out.println(i);
        }
    }
}
