package IntroToOops;

public class Student {
    public String name;
    private int age;
    float psp;
    protected String batch;

    void attendClass(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("psp : " + psp);
        System.out.println("batch : " + batch);
        System.out.println("Student is attending class");
    }
}
