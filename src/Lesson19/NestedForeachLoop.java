package Lesson19;

public class NestedForeachLoop {
    public static void main(String[] args) {
        String [] students = {"Petro","Marichka","Bogdan"};
        String [] exams = {"Math","Art","Economy"};

        for (String s1: students) {
            for (String s2: exams) {
                System.out.println(s1+" "+s2);
            }
        }

        int [][] array = {{1,2,3},{1,2},{1,2,3,4,5,6}};
        for (int [] i: array){ // foreach loop
            for (int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
