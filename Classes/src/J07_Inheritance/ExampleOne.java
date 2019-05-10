/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07_Inheritance;

/**
 *
 * @author TouhidulIslam
 */
public class ExampleOne {
    public static void main(String[] args) {
        Student stuOne = new Student();
        System.out.println("Name: "+stuOne.name);
        System.out.println("Age: "+stuOne.age);
        System.out.println("Age: "+stuOne.gradYear);
        stuOne.study();
    }
}
