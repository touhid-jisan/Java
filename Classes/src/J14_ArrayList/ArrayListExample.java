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

public class ArrayListExample {
   public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList<String>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Mazda");
       cars.add("Mustang");
       cars.add("Ford");
       cars.add("Vo");
       cars.add("lvo");
       System.out.println(cars);
       System.out.println(cars.get(0));
       
       cars.set(2, "Jisan");
       System.out.println(cars);

       cars.add(2, "Touhid");
       System.out.println(cars);

       
       System.out.println(cars.contains("Vo"));
       
       System.out.println("--------- For Loop---------");
       for(int i=0;i<cars.size();i++){
           System.out.println(cars.get(i));
       }
       
       System.out.println("--------- For Each Loop---------");
       for(String i:cars){
           System.out.println(i);
       }
       
       ArrayList<Integer> myNumbers = new ArrayList<Integer>();
       myNumbers.add(10);
       myNumbers.add(20);
       myNumbers.add(30);
       myNumbers.add(40);
       myNumbers.add(50);
       for(int i:myNumbers){
           System.out.println(i);
       }
   }
}
