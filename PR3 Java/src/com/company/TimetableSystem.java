package com.company;
import java.util.ArrayList;
import java.lang.Integer;

class TimetableSystem {

    private ArrayList<Integer>[][] TimeTable = new ArrayList[6][6];
    private ArrayList<professor> Users = new ArrayList<>();
    private ArrayList<request> Request= new ArrayList<>();
    private user CurrentUser;
    private int countOfRooms;
    private int pairsinDay = 6;

    void changecountofrooms(int c)
    {
        this.countOfRooms = c;
    }
    int getcountofrooms(){return this.countOfRooms;}
    ArrayList<professor> getUsers(){return this.Users;}


    void addUser(professor P)
    {
        this.Users.add(P);
    }
    void addRequest(request R)
    {
        this.addRequest(R);
    }
    void findUser(String S)
    {
        for(int i = 0; i < Users.size(); i++)
        {
            if(Users.get(i).getLogin() == S)
            {
                System.out.println("--------------");
                System.out.println("User in list");
                System.out.println("INDEX : " + i);
                System.out.println("--------------");
            }
        }
    }
    void getinfo(professor P)
    {
        int index =  Users.indexOf(P);
        for(int x = 0;  x < 6 ; x++ ) {
            for (int y = 0; y < 6; y++) {
                if(TimeTable[x][y].indexOf(index) != -1)
                System.out.println("You have lesson on day " + x + " pair " + y );
            }
        }
    }
    void processRequests()
    {
        request R = new request();
        for(int i =0 ; i < this.Request.size(); i++)
        {
            R = this.Request.get(i);
            int index = Users.indexOf(R);
            for(int x = 0;  x < 6 ; x++ )
            {
                for(int y = 0; y < 6 ; y++)
                {
                    if(TimeTable[x][y].size() != this.countOfRooms)
                        TimeTable[x][y].add(index);
                }
            }

        }
        System.out.println("Successfully");
    }
}
