package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        //After application start up code
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student s = studentRegistry.get("Good");
        Student s1 = studentRegistry.get("HardWorking");
        Student s2 = studentRegistry.get("Intelligent");
        System.out.println("Debug");
    }

    private static void fillRegister(StudentRegistry studentRegistry) {
        Student goodStudent = new Student();
        goodStudent.name = "Good Student";
        goodStudent.age = 10;

        Student hardWorkingStudent = new Student();
        hardWorkingStudent.name = "Hard Working";

        IntelliStudent intelliStudent = new IntelliStudent();
        intelliStudent.name = "Intelligent Student";

        studentRegistry.put("Good", goodStudent);
        studentRegistry.put("HardWorking", hardWorkingStudent);
        studentRegistry.put("Intelligent", intelliStudent);
    }
}
