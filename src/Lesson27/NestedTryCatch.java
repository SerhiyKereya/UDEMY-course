package Lesson27;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NestedTryCatch {
    FileInputStream fis1, fis2;
    //method abc
    public void abc(){
        try {
            fis1 = new FileInputStream("someNonExistingFile1.txt");
            //nested try catch
            try {
                fis2 = new FileInputStream("someNonExistingFile.txt");
            }
            catch (FileNotFoundException e){
                System.out.println("fis2 stream - file not found ");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("fis1 stream - file not found ");
        }
        finally {
            System.out.println("outside finally block");
            try {
                fis1.close();
                fis2.close();
            }
            catch (IOException e){
                System.out.println("finally block had an exception");
            }
        }
    }

    public static void main(String[] args) {
        NestedTryCatch n = new NestedTryCatch();
        n.abc();
    }
}
