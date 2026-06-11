package org.scoula.ex05.domain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class Member {
    private String name;
    private String userid;

    public Member() {
    }

    public Member(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getUserid (){
        return userid;
    }
    public void setUserid (String userid){
        this.userid = userid;
    }

}