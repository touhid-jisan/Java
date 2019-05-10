/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J12_Enums;

/**
 *
 * @author TouhidulIslam
 */

public class EnumInClass {
    enum Level {
        HIGH, LOW, MEDIUM
    }
    
    public static void main(String[] args) {
        Level myEnum = Level.MEDIUM;
        System.out.println(myEnum);
    }
}
