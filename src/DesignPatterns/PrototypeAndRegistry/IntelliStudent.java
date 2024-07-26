package DesignPatterns.PrototypeAndRegistry;

public class IntelliStudent extends Student{
    int iq;


    public IntelliStudent() {
    }

    public IntelliStudent(IntelliStudent s) {
        super(s);
        this.iq = s.iq;
    }

    @Override
    public IntelliStudent copy() {
        //Any type of copy code here.
//        IntelliStudent copyIntelliStudent = new IntelliStudent();
//        copyIntelliStudent.age = this.age;
//        copyIntelliStudent.name = this.name;
//        return copyIntelliStudent;

        return new IntelliStudent(this);
    }
}
