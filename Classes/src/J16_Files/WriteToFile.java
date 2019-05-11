/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J16_Files;

/**
 *
 * @author TouhidulIslam
 */


import java.io.File;
import java.io.FilterWriter;


public class WriteToFile {
    public static void main(String[] args) {
        try {
             File myFileOne = new File("D:\\Education\\tutorial\\practice\\java-practice\\Classes\\src\\J16_Files\\fileOne.txt");
             myFileOne.write("Line One \n Line two");
             myFileOne.close();
             System.out.println("Successfully wrote to the file");
        } catch(Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
