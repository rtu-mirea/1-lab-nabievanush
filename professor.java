package com.company;

class professor extends user {


    professor(String _name, String _login, String _password)
    {
        super(_name,_login,_password);
    }
    void takeResult(TimetableSystem T)
    {
        T.getinfo(this);
    }

}
