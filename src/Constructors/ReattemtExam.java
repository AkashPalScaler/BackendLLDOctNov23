package Constructors;

public class ReattemtExam {
    String reattempt_id;
    int reattempt_marks;

    public ReattemtExam(){
        this.reattempt_id = "132";
        this.reattempt_marks =100;
    }

    //Copy constructor
    public ReattemtExam(ReattemtExam re){
        this.reattempt_id = re.reattempt_id;
        this.reattempt_marks = re.reattempt_marks;
    }
}
