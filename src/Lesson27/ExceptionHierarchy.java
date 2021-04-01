package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        //file located /Users/i057814/OneDrive - SAP SE/Hello world/src/someNonExistingFile.txt
        File f = new File("someNonExistingFile1.txt"); // java compile and run don't care if the file exist
        try {
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("exception 1");
        }
        catch (NullPointerException e){
            System.out.println("exception 2");
        }
        catch (IOException e){  // parent for FileNotFound
            System.out.println("exception 3");
        }
        catch (Exception e){ // parent for IOException
            System.out.println("exception 4");
        }
        catch (Throwable e){ // parent for Exception
            System.out.println("exception 5");
        }
    }
}
