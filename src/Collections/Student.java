package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    Integer psp;
    Integer age;

    @Override
    public int compareTo(Student other) {
        //this //other
        if(this.age < other.age){
            return 1;
        }else if(this.age > other.age){
            return -1;
        }
        return 0;
    }
}

