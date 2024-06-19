package Constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();

        Student s1 = new Student("Sam", 30, "Nov23");

        Student s2 = s1;

        Student s3 = new Student(s1);

        System.out.println(Student.noOfStudents);
        Student.printNoOfStudentObject(s1);
        System.out.println("Debug");
    }
}
