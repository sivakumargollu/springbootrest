package com.ws;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by sivag on 11/4/17.
 */
public class Greeting {

    private  int id;
    private  String name;
    private  String myname;

    public Greeting(int id,String name,String myname) {
        this.id = id;
        this.name  = name;
        this.myname = myname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMyname(){
        return myname;
    }
}
