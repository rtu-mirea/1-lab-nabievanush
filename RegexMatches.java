package com.company;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
class RegexMatches {

 //Шаблон убийственный

 private String INPUT = "FF02:0000:0000:0000:0000:0001:FF00:0300";


 void find() {
  String REGEX = "(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}" +
          ":|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}" +
          "(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}" +
          "|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}" +
          "(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:" +
          "((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|:" +
          ":(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])" +
          "|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))";

  Pattern p = Pattern.compile(REGEX);
  Matcher m = p.matcher(INPUT);   // получение matcher объекта

  if(m.find())
   System.out.println("True");
  else
   System.out.println("False");

 }
 void find_change()
 {
  String REGEX = "\\b[\\d]+\\b";
  Pattern p = Pattern.compile(REGEX);
  Matcher matcher = p.matcher(INPUT);

  while (matcher.find()) {
   String convert = Integer.toHexString(Integer.parseInt(matcher.group()));
   INPUT.replaceAll(matcher.group(),convert);
  }
 }

}