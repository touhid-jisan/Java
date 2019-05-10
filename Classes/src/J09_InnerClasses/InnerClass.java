/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J09_InnerClasses;

/**
 *
 * @author TouhidulIslam
 */
class OuterClass{
    int x = 10;
    class InnerClass{
        int y = 20;
    }
}


public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("My Inner Variable: "+myInner.y + ",  My Outer variable: " + myOuter.x);
    }
}
