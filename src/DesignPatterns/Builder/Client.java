package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {

        //Version1
//        StudentBuilder sb = new StudentBuilder();
//        sb.setAge(19);
//        sb.setName("Akash");
//        sb.setBatch("SeptLLD");
//        sb.setYear(2021);

//        Student s = new Student(sb);

        //Version2
//        StudentBuilder sb2 = Student.getBuilder();
//        sb2.setAge(19);
//        sb2.setName("Akash");
//        sb2.setBatch("SeptLLD");
//        sb2.setYear(2021);
//
//        Student s2 = new Student(sb2);

        //Version3
        Student s3= Student
                .getBuilder()
                .setYear(2021)
                .setAge(19)
                .setBatch("SeptLLD")
                .setName("Akash")
                .build();


    }
}
