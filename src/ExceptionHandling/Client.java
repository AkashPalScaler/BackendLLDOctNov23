package ExceptionHandling;

import java.lang.instrument.ClassDefinition;

public class Client {

    public static void test(int a){
        test(a*a);
    }
    public static void main(String[] args) throws Exception, ArithmeticException{
        try{
            int z = 10;
            Student.doSomething(10);
            //db.query
            float y = 1/z;
            //db.close
            test(10);
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
            //db.close
            throw e;

        }
        catch(ArithmeticException e){
            System.out.println("This is arithmetic exception, please don not give 0");
            //db.close
            throw e; //Unchecked excpetion
        }
        catch(CustomException e){
            //db.close
            throw e;
        }
        catch(RuntimeException e){
            System.out.println("Runtime problems");
            //db.close
            throw e; //Unchecked excpetion
        }
        catch(Exception e){
            System.out.println("Error occurred  :" + e.getMessage());
            //db.close
            throw e;
        }catch(StackOverflowError e){
            System.out.println("FATAL ERROR!!");
        }
        finally {
            System.out.println("Closing the DB!");
        }
        // fun1 <- fun2 <- fun3(catch here and in the catch block write a retry call) <- fun4 <- main (caught and loggged and user should proper error response)
        System.out.println("Hello World!");
    }
}
