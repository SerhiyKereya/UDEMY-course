package Lesson16;

public class HomeWork16 {

    static String spamList = "iam@yahoo.com; he@ukr.net; she@gmail.com;";

    static void emailSort (String spamList){
        char c1;
        char c2;
        for (int i=0; i<spamList.length(); i++){
            c1 = spamList.charAt(i);

            if (c1 == '@'){
                while (spamList.charAt(i+1) != '.'){
                    i++;
                    c2 = spamList.charAt(i);
                    System.out.print(c2);
                }
               // else if ()
            }
            if (spamList.charAt(i)=='.'){
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        emailSort(spamList);

    }
}
