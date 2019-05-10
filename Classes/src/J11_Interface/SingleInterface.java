/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11_Interface;

/**
 *
 * @author TouhidulIslam
 */
interface Animal{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal{
    public void animalSound() {
        System.out.println("Pig says : Weee Weee");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
}


public class SingleInterface {
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
