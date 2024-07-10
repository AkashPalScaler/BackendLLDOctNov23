package LambdaAndStreams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        //Create a class and implement runnable
        //Use runnable object to start a thread

        Runnable r = new ThreadedProgram();

        //Anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                //Lines of code has no reusability
                System.out.println("Hello to world from anonymous class!");
            }
        };

        //Lambda
        Runnable r2 = () -> {
            //Lines of code has no reusability
            System.out.println("Hello");
            System.out.println("Hello to world from Lambda!");
        };

        //Lambda 2
        Runnable r3 = () -> System.out.println("Hello to world from Lambda!");

        Thread t = new Thread(r3);
//        t.start();

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

        List<Student> studentList = new ArrayList<>();
        studentList.add(s);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age > o2.age){
                    return 100; //Positiuve
                }else if(o1.age < o2.age){
                    return -100;//Negative
                }
                return 0;
            }
        });

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });

        Collections.sort(studentList, (o1, o2) -> o1.age - o2.age);

        List<Integer> nums = List.of(1,5,2,6,9);
        Collections.sort(nums, (o1, o2) -> o1 - o2);

        for(Student o: studentList){
            System.out.println(o.name);
            System.out.println(o.age);
            System.out.println(o.psp);
            System.out.println("--------------");
        }

    }
}
