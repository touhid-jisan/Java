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
enum Level{
    HIGH, MEDIUM,LOW
}
public class EnumInLoop {
    public static void main(String[] args){
        
        for(Level myLevel: Level.values()){
            System.out.println(myLevel);
        }
    }
}
