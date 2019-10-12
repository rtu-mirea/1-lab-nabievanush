package com.company;
import java.util.Random;
//import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main
{
    static void selectionSort(int num[], int size)
    {
        int min, temp;
        for (int i = 0; i < size - 1; i++)
        {
            min = i; // запоминаем индекс текущего элемента
            // ищем минимальный элемент чтобы поместить на место i-ого
            for (int j = i + 1; j < size; j++)
            {
                if (num[j] < num[min])
                    min = j;
            }
            temp = num[i];      // меняем местами i-ый и минимальный элементы
            num[i] = num[min];
            num[min] = temp;
        }
        System.out.println("----------ARRAY AFTER SORT----------");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = in.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        System.out.println("----------ARRAY----------");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        int from,to = 0;

        System.out.println("Enter the range ");
        System.out.println("FROM : ");
        from = in.nextInt();
        System.out.println("TO : ");
        to = in.nextInt();

        int j = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] >= from && array[i] <= to)
            {
                System.out.print(array[i]+ " ");
                j++;
            }
        }
        System.out.println();
        System.out.println("Answer: " + j);

        selectionSort(array,array.length);
    }
}
