package LambdaAndStreams;

import java.util.Objects;

public class Student {
    String name;
    Integer psp;
    Integer age;

    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
        if(this.name == st.name){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }
}