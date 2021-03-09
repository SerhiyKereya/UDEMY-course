package Lesson19;

//import java.util.Arrays;

public class HomeWork {
    public static String[] abc(String [] ... commandArgumentsArray){ // array of unnown number of String arrays commandArgumentsArray
        int length = 0;  // so this is two dimensional array
        for (String[] array2: commandArgumentsArray) {
            length += array2.length;
        }
        String [] a = new String[length];
        int count = 0;
        for (String[] array2 : commandArgumentsArray) {
            for (String s : array2) {
                a[count] = s;
                count++;
            }
        }

        return a;
    }

    public static void main(String[] args) { // this class should be run form CMD with parameters - i057814$ java HomeWork.java some some some

        String [] a = abc(new String[]{"do","some","work"}, new String[]{"stop doing","some","work"});

        System.out.println("zero array element: "+args[0]);
        for (String s: args) {
            for (int i=0; i<a.length;i++){
                if (s.equals(a[i])){
                    a[i]=null;
                }
            }
        }

        for (String s: a) {
            System.out.print(s +" ");
        }
        System.out.println();
    }
}
