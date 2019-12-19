package com.company;
import java.io.RandomAccessFile;
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileFor4 {//класс управления файла текстового типа
    String path;
    ArrayList<Person> people = new ArrayList<Person>();
    public FileFor4(String path){

        this.path = path;
    }
    public void add()throws IOException, Exception, FileNotFoundException{//добавить пробный элемент
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(path)))
        {
            Person person = new Person("Name", 15, 16);

            dos.writeUTF(person.Name);
            dos.writeInt(person.Age);
            dos.writeInt(person.height);

            dos.close();

        }

    }
    public ArrayList<Person> transcript(){//создать из текста список
        try(DataInputStream dos = new DataInputStream(new FileInputStream(path)))
        {

            int i = 0;
            int age =0;
            int height=0;
            String Name= "";
            while(0<dos.available()) {
                Name = dos.readUTF();
                age = dos.readInt();
                height = dos.readInt();
                Person person = new Person(Name, age, height);
                people.add(person);
                i++;

            }

            return people;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return null;
    }
}