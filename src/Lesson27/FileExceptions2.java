package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExceptions2 {
    public static void main(String[] args) throws Exception { // do something with Exceptions, 'throws' remind you that exeption could be not catched

        //file located /Users/i057814/OneDrive - SAP SE/Hello world/src/someNonExistingFile.txt
        File f = new File("someNonExistingFile1.txt"); // java compile and run don't care if the file exist

        try {
            FileInputStream fis = new FileInputStream(f); //  will throw FileNotFoundException
            fis.read(); // read file
            FileOutputStream fos = new FileOutputStream(f); // also can trow exception
            fos.write(100);
        }
        catch (FileNotFoundException e){
            System.out.println("some exeption was catch = " + e);
        }
    }
}
