package Constructors;

public class Exam {
    String exam_id;
    int marks;
    ReattemtExam reattemtExam;

    public Exam() {
        this.exam_id = "1";
        this.marks = 0;
        reattemtExam = new ReattemtExam();
    }

    public Exam(String exam_id, int marks) {
        this.exam_id = exam_id;
        this.marks = marks;
        reattemtExam = new ReattemtExam();
    }

    //Copy constructor
    public Exam(Exam other){
        this.exam_id = other.exam_id;
        this.marks = other.marks;
        this.reattemtExam = new ReattemtExam(other.reattemtExam);
    }
}
