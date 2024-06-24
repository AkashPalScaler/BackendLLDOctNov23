package Inheritance;

public class Client  {
    public static void main(String[] args) {

//        User.display();
//        Student.display();

        Student s = new Student();
        s.display();
        User u = new User();
        u.display();

        //Overriding doesn't happen, what happens is termed method hiding
        User u1 = new Student();
        u1.display();


        System.out.println("Debug!");
    }
}
