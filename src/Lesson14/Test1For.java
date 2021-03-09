package Lesson14;

public class Test1For {
    public static void main(String[] args) {

        for (int i = 1, j = 10; i <= 10 && j<200 ; i++, j=j+20){
            if (i==2){
                System.out.println("skip 2");
                continue;
            }

            if (i==7){
                System.out.println("the end");
                 break;
            }
            System.out.println(i+" bla bla cycle "+j);
        }
    }
}
