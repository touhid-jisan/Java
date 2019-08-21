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
enum Days{
    SAT, SUN, MON, TUES, WED, THRUS, FRI
}
public class EnumInSwitchStatement {
    public static void main(String[] args){
        Days myDays = Days.SAT;
        switch(myDays){
            case SAT:
                System.out.println("Today is Sat Day");
                break;
            case SUN:
                System.out.println("Today is Sun Day");
                break;
            case MON:
                System.out.println("Today is MON Day");
                break;
            case TUES:
                System.out.println("Today is TUES Day");
                break;
            case WED:
                System.out.println("Today is WED Day");
                break;
            case THRUS:
                System.out.println("Today is THRUS Day");
                break;
            case FRI:
                System.out.println("Today is FRI Day");
                break;
        }
    }
}
