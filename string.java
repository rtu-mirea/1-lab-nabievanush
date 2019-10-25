package com.company;
import java.lang.String;
import java.util.Scanner;

class _str
{
    private String s ;

    void set_string(String some_str)
    {
        char[] chararr = some_str.toCharArray();
        if(chararr[chararr.length-1] != '.')
            this.s = some_str + ".";
        else this.s = some_str;
    }

    void get_string()
    {
        System.out.println(this.s);
    }
    boolean check_vowels(char s)
    {
        if(        s == 'а' || s == 'у' || s == 'е' || s == 'и' || s == 'я'
                || s == 'о' || s == 'ы' || s == 'ё' || s == 'ю' || s == 'э'
                || s == 'А' || s == 'У' || s == 'Е' || s == 'И' || s == 'Я'
                || s == 'О' || s == 'Ы' || s == 'Ё' || s == 'И' || s == 'Я')
        return true;
        else return false;
    }
    boolean check_numbers(char s)
    {
        if(        s == '0' || s == '1' || s == '2' || s == '3' || s == '4'
                || s == '5' || s == '6' || s == '7' || s == '8' || s == '9')
            return true;
        else return false;
    }

    void count_vowels()
    {
        char[] chararr = this.s.toCharArray();

        for(int i = 0; i < chararr.length-1;i++) {
            if (!(check_vowels(chararr[i]))) {
                while ((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.')) {
                    i++;
                }
            } else {
                if (i != chararr.length - 1) {
                    int m = i;
                    while ((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.')) {
                        i++;
                    }
                    if (check_vowels(chararr[i - 1])) {
                        for (int j = m; j < i; j++) {
                            System.out.print(chararr[j]);
                        }
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    void change_toUpCase()
    {
        boolean check = false;
        char[] chararr = this.s.toCharArray();
        for(int i = 0; i < chararr.length - 3; i++)
        {
            if((chararr[i] == 'п' ||chararr[i] == 'П') && chararr[i+1] == 'р' && (chararr[i+2] == 'е' ||chararr[i+2] == 'и') )
            {
                check = true;
                while((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.'))
                {
                    chararr[i] = Character.toUpperCase(chararr[i]);
                    i++;
                }
            }
        }
        if(check)
        {
            for(int i = 0; i < chararr.length; i++)
            {
                System.out.print(chararr[i]);
            }
            System.out.println();
        }
    }
    void search_num() {
        int from,to = 0;
        char[] chararr = this.s.toCharArray();
        Scanner in = new Scanner(System.in);
        System.out.println("from :");
        from = in.nextInt();
        System.out.println("to:");
        to = in.nextInt();

        for (int i = 0; i < chararr.length - 1; i++) {
            if (!(check_numbers(chararr[i]))) {
                while ((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.')) {
                    i++;
                }
            }
            else
            {
                if (i != chararr.length - 1)
                {
                    int m = i;
                    while ((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.'))
                    {
                        i++;
                    }
                    if (check_numbers(chararr[i - 1]))
                    {
                        String num = "";
                        for (int j = m; j < i; j++)
                        {
                            num = num + Character.toString(chararr[j]);
                        }
                        int x = Integer.parseInt(num);
                        if((x>=from) && (x<=to)) System.out.print(x);
                        System.out.print(" ");
                    }
                }

            }
        }
    }
}
