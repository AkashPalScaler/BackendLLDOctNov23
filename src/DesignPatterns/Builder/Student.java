package DesignPatterns.Builder;

import java.sql.SQLOutput;

public class Student {
    String name;
    int age;
    String batch;
    int psp;
    int year;

    private Student(StudentBuilder builder) {
        if(builder.name == null) {
            System.out.println("Name can't be null");
//            throw new Exception("Name can't be null");
        }
        this.name = builder.name;

        if(builder.age < 20){
            System.out.println("Age can't be less than 20");
//            throw new Exception("Age can't be less than 20");
        }
        this.age = builder.age;

        this.batch = builder.batch;
        this.psp = builder.psp;
        this.year = builder.year;

    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        String name;
        int age;
        String batch;
        int psp;
        int year;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}
