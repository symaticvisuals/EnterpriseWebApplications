package com;

import java.util.Scanner;

public class User {
    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(Scanner s) {

       this.name=s.next();
       this.age=s.nextInt();
    }
}
