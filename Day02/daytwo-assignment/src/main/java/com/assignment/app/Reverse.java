package com.assignment.app;

public class Reverse {

    public static String rev(String a){
        String r = "";
        char ch;
        for (int i=0; i<a.length(); i++)
        {
            ch= a.charAt(i);
            r= ch+r;
        }
        return r;
    }
}
