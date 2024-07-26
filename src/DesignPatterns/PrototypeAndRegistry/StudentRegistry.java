package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> register;

    public StudentRegistry(){
        register = new HashMap<>();
    }

    void put(String key, Student s){
        register.put(key, s);
    }

    Student get(String key){
        Student s = register.get(key);
        return s.copy();
    }
}
