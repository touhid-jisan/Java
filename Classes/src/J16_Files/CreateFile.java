/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*

Method                  Type            Description
canRead()               Boolean         Tests whether the file is readable or not
canWrite()              Boolean         Tests whether the file is writable or not
createNewFile()         Boolean         Creates an empty file
delete()                Boolean         Deletes a file
exists()                Boolean         Tests whether the file exists
getName()               String          Returns the name of the file
getAbsolutePath()	String          Returns the absolute pathname of the file
length()                Long            Returns the size of the file in bytes
list()                  String[]	Returns an array of the files in the directory
mkdir()             	Boolean         Creates a directory

*/


package J16_Files;

/**
 *
 * @author TouhidulIslam
 */
import java.io.File; // Import the file class
import java.io.IOException; // to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myFileOne = new File("D:\\Education\\tutorial\\practice\\java-practice\\Classes\\src\\J16_Files\\fileOne.txt");
            if(myFileOne.createNewFile()) {
                System.out.println("File Created: " + myFileOne.getName());
            } else {
                System.out.println("File Already Exists");
            } 
        }catch(IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
}
