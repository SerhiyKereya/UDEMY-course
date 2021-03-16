package Lesson23.p2;

import Lesson23.HomeWorkOverrideX;

public class HomeWorkOverrideY extends HomeWorkOverrideX {
    //HomeWorkOverrideY(){}
    public void abc(){ System.out.println("Y" ); }
    public void def(){HomeWorkOverrideY y = new HomeWorkOverrideY(); y.abc();}
    // abc() has protected access in Lesson23.HomeWorkOverrideX
     //public void ghi(){HomeWorkOverrideX x = new HomeWorkOverrideY(); x.abc();}

    public static void main(String[] args) {
        HomeWorkOverrideY a = new HomeWorkOverrideY();
        a.abc(); a.def(); //a.ghi();
    }
}
