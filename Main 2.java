package com.company;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void ex4_File()
    {
        FileFor4 TextFor4 = new FileFor4("inf.txt");
        Exercise4 Task4 = new Exercise4("per.dat");
        Task4.addl(TextFor4.transcript());
        Task4.put();
        Task4.take();
    }
    public static void ex3_File() throws FileNotFoundException, UnsupportedEncodingException
    {
        // 3.1 BEGIN

        File F1 = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/File1.txt");
        File F2 = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/File2.txt");
        try {
            boolean created = F1.createNewFile() && F2.createNewFile();
            if(created){
                System.out.println("Files " +  F1.getName() + " and "+ F2.getName() + " has been created");
                System.out.println(F1.getAbsolutePath());}
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader(F1))
        {
            FileWriter writer = new FileWriter(F2, false);
            int c;
            while((c=reader.read())!=-1)
            {
                 writer.append((char)c);
            }
            writer.flush(); //Что то типо сохранения изменений
            writer.close();
            reader.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //3.1 END

        //3.2 BEGIN

        File Afile = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/A.txt");
        File Bfile = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/B.txt");
        try{
            boolean created = Afile.createNewFile() && Bfile.createNewFile();
            if(created){
                System.out.println("Files " +  Afile.getName() + " and "+ Bfile.getName() + " has been created");
                System.out.println(Afile.getAbsolutePath());}
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(BufferedReader inB = new BufferedReader (new FileReader("/Users/admin/Documents/PR4 JAVA/src/com/company/A.txt")))
        {
            BufferedWriter outB = new BufferedWriter(new FileWriter("/Users/admin/Documents/PR4 JAVA/src/com/company/B.txt"));

            char[] buf = new char[128];
            int c;
            int x = 0;

            while((c = inB.read(buf))>0){

                if(c < 128){
                    buf = Arrays.copyOf(buf, c);
                }
                outB.write(buf);
                outB.newLine();
                outB.flush();
           }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //3.2 END

        //3.3 Start
        try(BufferedReader inA = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/admin/Documents/PR4 JAVA/src/com/company/A.txt"), "UTF-8"))) {
            System.out.println(Charset.defaultCharset().name());
            //When Charset is Cp1251 trows exception
            char[] buf = new char[128];
            int c;
            int x = 0;

            while ((c = inA.read(buf)) > 0) {

                if (c < 128) {
                    buf = Arrays.copyOf(buf, c);
                }
            }
            for (int i =0 ; i < 128;i++)
            {
                System.out.print(buf[i]);
            }
        }
        catch(IOException ex){

        System.out.println(ex.getMessage());
        }

        // 3.3End

    }
    public static void ex2_File()
    {

    }
    public static void ex1_File()
    {
        //exercise №1.1 , 1.2
        Scanner scan = new Scanner(System.in);

        File F1 = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/MyFile1.txt");
        try {
            boolean created = F1.createNewFile();
            if(created){
                System.out.println("File " +  F1.getName() + " has been created");
                System.out.println(F1.getAbsolutePath());}
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();

        File F2 = new File("/Users/FilesJava/MyFile2.txt");
        try {
            boolean created = F2.createNewFile();
            if(created){
                System.out.println("File " +  F2.getName() + " has been created");
                System.out.println(F2.getAbsolutePath());}
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();

        File F3 = new File("/Users/FilesJava/MyFile3.txt");
        try {
            boolean created = F3.createNewFile();
            if(created){
                System.out.println("File " +  F3.getName() + " has been created");
                System.out.println(F3.getAbsolutePath());}
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();

        File theDir1 = new File( "/Users/admin/Documents/PR4 JAVA/src/com/company/First");
        theDir1.mkdir();
        File theDir2 = new File( "/Users/admin/Documents/PR4 JAVA/src/com/company/First/Second");
        theDir2.mkdir();
        File theDir3 = new File( "/Users/admin/Documents/PR4 JAVA/src/com/company/First/Second/Third");
        try{
            theDir3.mkdir();
            boolean created = theDir3.exists();
            if(created){
                System.out.println("Directory "+ theDir3.getName() + " has been created");
                System.out.println(theDir3.getAbsolutePath());}
        }
        catch(SecurityException se){
            System.out.println(se.getMessage());
        }
        System.out.println();
        //exercise №1.3

        File folder = new File("/Users/admin/Documents/PR4 JAVA/src/com/company/");
        File[] listOfFiles = folder.listFiles();

        System.out.println("ALL FILES IN CURRENT APP DIRECTORY");
        for (int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile()) {
                System.out.println("File : " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory : " + listOfFiles[i].getName());
            }
        }
        //DELETE ALL THIS TRASH
        theDir3.delete();
        theDir2.delete();
        theDir1.delete();
        F1.delete();
        F2.delete();
        F3.delete();
    }



    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

    }
}
