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
interface MyFirstInterface{
    public void myFirstMethod();
}
interface MySecondInterface{
    public void mySecondMethod();
    
}
class MyClass implements MyFirstInterface, MySecondInterface{
    public void myFirstMethod() {
        System.out.println("First Interface Method");
    }
    public void mySecondMethod() {
        System.out.println("Second Interface Method");
        
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.myFirstMethod();
        myObj.mySecondMethod();
        
    }
}
