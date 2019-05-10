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
class COuterClass{
    int x =20;
    class CInnerClass{
        public int myInnerMethod() {
            return x;
        }
    }
}


public class AccessOuterFromInner {
    public static void main(String[] args){
        COuterClass myOuter = new COuterClass();
        COuterClass.CInnerClass myInner = myOuter.new CInnerClass();
        System.out.println(myInner.myInnerMethod());
        
    }
}
