package LambdaAndStreams;

import java.util.HashMap;

public class StudentKeyHashMap {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Akash";
        s.psp = 15;
        s.age = 29;

        Student s2 = new Student();
        s2.name = "Sam";
        s2.psp = 19;
        s2.age = 30;

        Student s3 = new Student();
        s3.name = "Raushan";
        s3.psp = 100;
        s3.age = 25;

        Student s4 = new Student();
        s4.name = "Raushan";
        s4.psp = 100;
        s4.age = 25;

        HashMap<Student, Integer> hm = new HashMap<>();

        hm.put(s3, 4);
        hm.put(s4, 5);

        System.out.println(hm);
    }
}
