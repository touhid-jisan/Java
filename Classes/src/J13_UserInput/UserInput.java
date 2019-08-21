/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user

*/

package J13_UserInput;

/**
 *
 * @author TouhidulIslam
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Age , Salary");
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        System.out.println("Name: "+ name + ", Age: "+age+", Salary: "+salary);
    }
}
