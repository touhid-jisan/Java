/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02_ClassAttributes;

/**
 *
 * @author TouhidulIslam
 */
public class ClassAttributes {
    
    //class attributes are variables within a class
    //another term for class attributes is fields.
    int x = 5;
    int y = 6;
    final int z = 16; /*If you don't want the ability to 
                        override existing values, 
                        declare the attribute as final*/
    
    public static void main (String[] args){
        ClassAttributes obj1 = new ClassAttributes();
        System.out.println(obj1.x);
        
        ClassAttributes obj2 = new ClassAttributes();
        obj2.y = 10;
        System.out.println(obj2.y);
        // obj2.z = 30; cannot assign new value of z
        
    }
}
