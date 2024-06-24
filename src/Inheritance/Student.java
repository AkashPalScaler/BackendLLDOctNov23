package Inheritance;

public class Student extends User{
    //String username; //Inherited
    String batch;
    float psp;

    public Student(){
//        super(); // This always has to be the first line;
//        super("Akash", "pass");
        this("Akash", 0.5f);
//        System.out.println("No args constructor is called for Student");
    }

    public Student(String batch, float psp){
//        super(); // By default this is getting called
        this.batch = batch;
        this.psp = psp;
//        System.out.println("Parameterised constructor is called for Student");/
    }

    void changeBatch(){
//        id = "12323"; //Private members can't be inherited
        username = "Akash";
        password = "passpass";
//        System.out.println("Changing batch!");
    }

//    static void display(){
//        System.out.println("Student display");
//    }


}
