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
abstract class Person {
    public String name = "Jisan";
    public int age = 24;
    public abstract void study();
    
    
}
class Student extends Person{
    public int gradYear = 2019;
    public void study(  ){
        System.out.println("Studing");
    }
 }