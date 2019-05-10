/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06_PackagesAndAPI; // this is user defined package

// import a class
import java.util.Scanner;

// import a package
import java.util.*;


/**
 *
 * @author TouhidulIslam
 */
public class Packages {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String userName = sc.nextLine();
        System.out.println("Enter ID");
        int userId = sc.nextInt();
        System.out.println("User Name: " + userName + ", ID: "+userId);
    }
}
