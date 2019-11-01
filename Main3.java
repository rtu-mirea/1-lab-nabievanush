package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        TimetableSystem T = new TimetableSystem();

        Scanner scan = new Scanner(System.in);
        String answer0,answer1 = "";
        int x = 0;

        System.out.println("Enter the username");
        answer0 = scan.next();
        if(answer0 == "admin")
        {
            while (!"4".equals(answer1)){
                System.out.println("1. Add user ");
                System.out.println("2. Change count of rooms");
                System.out.println("3. Find user");
                System.out.println("4. Exit");
                answer1 = scan.next();

                try {
                    x = Integer.parseInt(answer1);
                } catch (NumberFormatException e){
                    System.out.println("Неверный ввод");
                }

                switch (x){
                    case 1:
                    {

                        System.out.println("Enter the name");
                        String name = scan.next();
                        System.out.println("Enter the login");
                        String login = scan.next();
                        System.out.println("Enter the password");
                        String pswrd = scan.next();
                        professor P = new professor(name,login,pswrd);
                        T.addUser(P);
                        System.out.println("Successfully");
                    }
                        break;
                    case 2:
                        int a = 0;
                        System.out.println("Enter the count of rooms");
                        a = scan.nextInt();
                        T.changecountofrooms(a);
                        System.out.println("Successfully");
                        break;
                    case 3:
                        System.out.println("Enter the login");
                        String login = scan.next();
                        T.findUser(login);
                }
            }
            System.out.println("До свидания!");
        }
        else
            System.out.println("Enter the name");
            String name = scan.next();
            System.out.println("Enter the login");
            String login = scan.next();
            System.out.println("Enter the password");
            String pswrd = scan.next();
            professor P = new professor(name,login,pswrd);
            for(int i = 0; i < T.getUsers().size(); i++)
            {
                if(T.getUsers().get(i) == P )
                {
                    {
                        while (!"3".equals(answer1)){
                            System.out.println("1. Create request ");
                            System.out.println("2. Show Time Table ");
                            System.out.println("3. Exit");
                            answer1 = scan.next();

                            try {
                                x = Integer.parseInt(answer1);
                            } catch (NumberFormatException e){
                                System.out.println("Неверный ввод");
                            }

                            switch (x){
                                case 1:
                                {

                                    System.out.println("Enter the discipline");
                                    String discipline = scan.next();
                                    System.out.println("Enter the group");
                                    int group = scan.nextInt();
                                    System.out.println("Enter the pairs in week");
                                    int pairsinweek = scan.nextInt();
                                    request R = new request(P,discipline,group,pairsinweek);
                                    T.addUser(P);
                                    System.out.println("Successfully");
                                }
                                break;
                                case 2:
                                    System.out.println("Time Table");
                                    P.takeResult(T);
                                    break;
                            }
                        }
                        System.out.println("До свидания!");
                    }
                }
            }
    }
}
