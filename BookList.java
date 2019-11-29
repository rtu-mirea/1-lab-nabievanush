package com.company;

public class BookList {
    int number;
    String author;
    String name;
    String dateOfGiving;
    String dateOfTaking;

    public BookList(int number_, String author_, String name_, String dateOfGive_, String dateOfTake_) {

        this.number = number_;
        this.author = author_;
        this.name = name_;
        this.dateOfGiving = dateOfGive_;
        this.dateOfTaking = dateOfTake_;
    }

    public int compare(BookList subb)
    {
        if (subb.author == this.author) {
            return 1;
        }
        return 0;
    }

    public String getDay(int number)
    {
        if (this.number == number)
            return this.name + " " + this.dateOfTaking;
        return "";
    }
}