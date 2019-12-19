package com.company;
import java.io.*;

//class for 4th exercise
public class Person implements Serializable {

    String  Name;
    int Age;
    int height;
    public Person(String name, int age, int height){
        Name = name;
        Age = age;
        this.height= height;
    }

}