package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PSPComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //o1 //o2
        if(o1.psp < o2.psp){
            return 1;
        }else if(o1.psp > o2.psp){
            return  -1;
        }
        return 0;
    }
}
public class Client2 {
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


        ArrayList<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s2);
        students.add(s3);

//        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(4); ar.add(5);
//        Collections.sort(students); -> Default
        Collections.sort(students, new PSPComparator());

        for(Student o: students){
            System.out.println(o.name);
            System.out.println(o.age);
            System.out.println(o.psp);
            System.out.println("--------------");
        }
    }
}
