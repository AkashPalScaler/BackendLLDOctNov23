package AccessModifiers;

import Inheritance.User;

public class Student extends User {
    String batch;
    float psp;

    void changeBatch(){
//        username = "Akash"; //Default  can't be used as outside package even if child class
        password = "passpass"; //Protected can be used outside package by child class
        System.out.println("Changing batch!");
    }

}
