package com.company;

class user {
    private String name;
    private String login;
    private String password;


    user(String _name, String _login, String _password)
    {
        this.name = _name;
        this.login = _login;
        this.password = _password;
    }
    String getLogin(){return this.login;}
    boolean enter(String name_, String login_, String password_)
    {
        if(this.name == name_ && this.login == login_ && this.password == password_)
            return true;
        else return false;
    }

    String getName()
    {
        return this.name;
    }

}
