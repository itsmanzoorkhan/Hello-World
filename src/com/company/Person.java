package com.company;

/**
 * Created by nawazkhan on 11/14/16.
 */
public class Person {
    private String name;
    private int age;
    private boolean isAlive;

    public static String hair = "Brown";

    public Person() {
        name = "Kyle";
    }

    public String getName(){
        return name;
    }

    public void setName(String n) {
        if(isValidName(n)) {
            name = n;
        }
    }

    public static boolean isValidName(String name) {
        return name.contains(" ") && !name.isEmpty() && name.length() <= 20;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if(a > 0) {
            age = a;
        }
    }
    public boolean isAlive() {
        return isAlive;
    }

}
