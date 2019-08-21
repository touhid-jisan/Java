/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J15_HashMap;

/**
 *
 * @author TouhidulIslam
 */
import java.util.HashMap;
public class JHashMap {
    public static void main(String[] args){
        HashMap<String, String> myCities = new HashMap<String, String>();
        myCities.put("Bangladesh", "Dhaka");
        myCities.put("Afghanistan", "Kabul");
        myCities.put("Canada", "Ottawa");
        myCities.put("Denmark", "Copenhagen");
        myCities.put("Germany", "Berlin");
        myCities.put("France", "Paris");
        System.out.println(myCities);
       
        System.out.println(myCities.get("Canada"));
        System.out.println(myCities.remove("Denmark"));
        System.out.println(myCities);        
        System.out.println("Size: "+myCities.size());    
        
        System.out.println("-----Loop Through a HashMap (for keys)----");
        for(String i: myCities.keySet()){
            System.out.println(i);
        }
        
        System.out.println("-----Loop Through a HashMap (for values)----");
        for(String i: myCities.values()){
            System.out.println(i);
        }
        
        System.out.println("-----Loop Through a HashMap (for keys)----");
        for(String i: myCities.keySet()){
            System.out.println("Key: " + i + ", Value: "+ myCities.get(i));
        }
        
        
        System.out.println("-----String keys Integer Values----");
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Jisan", 12);
        people.put("Touhid", 22);
        people.put("John", 33);
        people.put("Watson", 25);
        people.put("Steve", 30);
        
        for(String name: people.keySet()){
            System.out.println("Key: "+name + ", Value: "+people.get(name));
        }
        
    }
}
