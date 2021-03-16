package Lesson22;

public class HumanEncapsulation {
    final String sex;
    //constructor HumanEncapsulation - public to be used in other packages
    public HumanEncapsulation(String sex){
        this.sex = sex; // constructor will apply sex parameter
    }
    //Encapsulation for privat variable 'name'
            private String name; // privat is visible inside class only
            // public method allowed to see privat variable outside class
            public String getName(){
                return name;
            }
            // public method allow to change privat variable outside class
            public void setName(String s){ // void mothod returning anything
                name = s;
            }
    //Encapsulaton for age
            private int age; // privat is visible inside class only
            public int getAge(){
                return age;
            }
            public void setAge(int i){
                if (i>0){
                    age = i;
                }
            }
    // Encapsulaton for veight
            private int veight; // privat is visible inside class only
            public int getVeight(){
                return veight;
            }
            public void setVeight(int i){
                if (i>0){
                    veight = i;
                }
            }
    // Encapsulation for boolean isClever (not getClever)
            private boolean clever;
            public boolean isClever(){
                return clever;
            }
            public boolean getClever(){
                return clever;
            }
}

class Test{
    public static void main(String[] args) {
        // create object using constructor HumanIncapsulation
        HumanEncapsulation h = new HumanEncapsulation("male");
        h.setName("Petro");
        h.setAge(2300);
        h.setVeight(-75);

        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getVeight());
    }
}