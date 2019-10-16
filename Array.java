package com.company;
import java.util.Scanner;
public class Array
{
    public int len ;
    private int arr[] ;
    private boolean check = false;
    void Array()
    {
        int answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        len = in.nextInt();
        this.len = len;
        arr = new int[this.len];

        System.out.println("Choose a method to fill array ");
        System.out.println("1. Random values");
        System.out.println("2. Users values");
        answer = in.nextInt();
        if(answer == 1) RandomInput(1,20);
        else if (answer == 2) UserInput();
        System.out.println("Array created successfully");
    }

    void RandomInput(int min, int max)
    {
        for (int i = 0; i < len; i++)
        {
            this.arr[i] = (int)(Math.random() * max + min);
        }
        System.out.println("______________");
    }

    void UserInput()
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<len; i++)
        {
            System.out.println("Enter values number: " + i);
            arr[i]= in.nextInt();
        }
    }

    //Вывод массива
    void PrintArray()
    {
        System.out.println();
        System.out.println("______________");
        System.out.println("Array :");
        System.out.println();
        for (int i = 0; i<len; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("______________");
       // Menu2();
    }
    void PrintRange(int from,int to)
    {
        int j= 0;
        for (int i = 0; i < this.len; i++)
        {
            if(this.arr[i] >= from && this.arr[i] <= to)
            {
                System.out.print(this.arr[i]+ " ");
                j++;
            }
        }
        System.out.println();
        System.out.println("Answer: " + j);
      //  Menu2();
    }

    void selectionSort()
    {
        int min, temp;
        for (int i = 0; i < this.len - 1; i++)
        {
            min = i; // запоминаем индекс текущего элемента
            // ищем минимальный элемент чтобы поместить на место i-ого
            for (int j = i + 1; j < this.len; j++) {
                if (this.arr[j] < this.arr[min])
                    min = j;
            }
            temp = this.arr[i];      // меняем местами i-ый и минимальный элементы
            this.arr[i] = this.arr[min];
            this.arr[min] = temp;
        }
        System.out.println("Array was successfully sorted");
    }
}
