package Constructors;

public class Student {
    String name;
    int age;
    float psp;
    String batch;
    Exam exam;
    static int noOfStudents;

    void fun(){
        name = "Akash";
        System.out.println("Fun");
    }
    //You can't access non-static members from static context
    public static void printNoOfStudents(){
        System.out.println("No of students: " + noOfStudents);
//        fun(); //Non-static method can't be referenced from static
    }

    //You can't access non-static members from static context
    public static void printNoOfStudentObject(Student s){
        System.out.println("No of students: " + noOfStudents);
        System.out.println(s.name);
    }


    public Student(){
        name = "Akash";
        age = 29;
        psp = 0.0f;
        batch = "Oct23";
        exam = new Exam("12", 100);
        noOfStudents++;
    }

    public Student(String name, int age, String batch){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = 0.0f;
        exam = new Exam("12", 100);
        noOfStudents++;
    }

    //Copy Constructor
    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.batch = s.batch;
        this.exam = new Exam(s.exam);
        noOfStudents++;
    }
}
