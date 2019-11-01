package com.company;

class request {
    
    private professor Professor;
    private String disclipline;
    private int group;
    private int pairsinWeek;

    request( professor P_ , String discipline_, int group_ , int pairsinWeek_)
    {
        this.Professor = P_;
        this.disclipline = discipline_;
        this.group  = group_;
        this.pairsinWeek = pairsinWeek_;
    }

    professor getRequest()
    {
        return this.Professor;
    }

    String getDisclipline() { return this.disclipline; }

    int getGroup()
    {
        return this.group;
    }

    int getPairsinWeek() { return this.pairsinWeek; }
}
