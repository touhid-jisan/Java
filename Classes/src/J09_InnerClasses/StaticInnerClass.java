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
class BOuterClass{
    int x = 15;
    static class BInnerClass{
        int y = 30;
    }
}

public class StaticInnerClass {
    public static void main(String[] args){
        BOuterClass.BInnerClass myInner = new BOuterClass.BInnerClass();
        System.out.println(myInner.y);
    }
}
