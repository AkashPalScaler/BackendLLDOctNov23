package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    String id;
    String name;
    String batch;
    int age;

    public Student() {
    }
    //Proper deep copy
    public Student(Student s){
        this.age = s.age;
        this.id = s.id;
        this.batch = s.batch;
        this.name = s.name;
    }

    @Override
    public Student copy() {
        //Any type of copy code here.
        return new Student(this);
    }
}
