package ExceptionHandling;

public class Student {
    String name;
    String batch;

    static void doSomething(int x) throws Exception{

        if(x == 0){
            throw new Exception("Normal Exception"); // Checked
        }else if(x == 1){
            throw new RuntimeException("Runtime Exception"); //Unchecked
            // These are generally exceptions which can be handled in the code by the developers
            // These are expected to happen
        } else if(x ==2){
            throw new ArithmeticException("Arithmetic Exception");

        } else if(x == 3){
            throw new ClassNotFoundException();
        }else if(x ==4){
            throw new CustomException("My custom exception!");
        }
    }
}
