package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int from,to,answer = -1;
        Array arr = new Array();
        arr.Array();

        Scanner in = new Scanner(System.in);

        while(answer != 0)
        {
            System.out.println("Menu");
            System.out.println("1. Print array");
            System.out.println("2. Sort array");
            System.out.println("3. Print number in range...");
            answer = in.nextInt();
            System.out.flush();
            if(answer == 1) arr.PrintArray();
            else if(answer == 2) arr.selectionSort();
            else if (answer == 3)
            {

                System.out.println("from :");
                from = in.nextInt();
                System.out.println("to:");
                to = in.nextInt();
                arr.PrintRange(from,to);
            }
            else System.out.println("Error");
        }
    }
}