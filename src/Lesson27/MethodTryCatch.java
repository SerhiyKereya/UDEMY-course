package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MethodTryCatch {
    //method abc - static to be seen in main
    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("Hello");
        try {
            //file located /Users/i057814/OneDrive - SAP SE/Hello world/src/someNonExistingFile.txt
            File f = new File("someNonExistingFile1.txt"); // java compile and run don't care if the file exist
            FileInputStream fis = new FileInputStream(f);
            //return a; // second priority return
        }
        catch (FileNotFoundException e){
            a.append(" +catch exception");
            System.out.println("exception catchd and a="+a);
            return a;
        }
        finally { // finally block will run before return but after catch
            a.append(" +finally");
            System.out.println("this is finally block a="+a);
            //return a; // first priority return
        }
        return a; // will work only when finally and try do not have returns
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
