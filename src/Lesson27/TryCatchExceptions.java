package Lesson27;

public class TryCatchExceptions {
    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("we had array");

        try {
            System.out.println(array[5]); // out of bound exception -- array don't have index 5
            System.out.println("good luck for everyone");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("was catched exception");
            System.out.println(e);// will show some more details about exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally { // try should have catch or finally (finally is not mandatory)
            System.out.println("this is finally block and it RUNs always");
        }

        System.out.println("some next code");
    }
}
