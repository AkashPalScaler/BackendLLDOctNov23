package Inheritance;

public class User {
    private long id;
    String username;
    protected String password;

    //No args constructor looks like default
    public User(){
//        System.out.println("No args constructor is called for User");
    }
    //Telescopic constructors
    public User(long id){
        this.id = id;
    }

    public User(long id, String username){
        this(id);
        this.username = username;
    }

    public User(long id, String username, String password){
        this(id, username);
        this.password = password;
        System.out.println("Parameterised constructor is called for User");
    }

    void login(){
        System.out.println("User is logged in!");
    }

    private long getId(){
        return id;
    }

    static void display(){
        System.out.println("User display");
    }

}
