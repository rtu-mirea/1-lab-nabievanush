package com.company;
import java.util.regex.Pattern;

import java.util.regex.Matcher;



public class strB {

    private StringBuilder strB = new StringBuilder();

    void set_string(String some_str)
    {
        char[] chararr = some_str.toCharArray();
        if(chararr[chararr.length-1] != '.')
            this.strB.append(some_str + ".");
        else this.strB.append(some_str);
    }

    void get_string()
    {
        System.out.println(this.strB.toString());
    }

    void delete_word()
    {
        int j = 0;
        char[] chararr = this.strB.toString().toCharArray();
        if(strB.length() > 3)
        {
            for (int i = 0; i < chararr.length - 3; i++) {
                if (chararr[i] == 'п' && chararr[i + 1] == 'р' && (chararr[i + 2] == 'е' || (chararr[i + 2] == 'и'))) {
                    while ((chararr[i] != ' ' && chararr[i] != ',' && chararr[i] != '.')) {
                        j++;
                    }
                    strB.delete(i, j+i);
                }
            }
        }
    }

    void insert()
    {
        int j = 0;
        String REGEX = "[а-яА-Я]";
        String S = this.strB.toString();
        Pattern p = Pattern.compile(REGEX);
        Matcher matcher = p.matcher(S);
        while (matcher.find()) {
            S.replaceAll(matcher.group(),matcher.group() + " 0000000 ");
        }
        strB.delete(0,strB.length());
        strB.append(S);
    }
}
