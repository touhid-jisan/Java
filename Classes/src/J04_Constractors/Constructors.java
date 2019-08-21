/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04_Constractors;

/**
 *
 * @author TouhidulIslam
 */
public class Constructors {
    public static void main (String[] args) {
        MyClass obj1 = new MyClass(1969, "Mustang");
        obj1.x = 10;
        System.out.println(obj1.x);
        System.out.println("Car Name : " +obj1.modelName + ", Model Year: " + obj1.modelYear);
    }
}
