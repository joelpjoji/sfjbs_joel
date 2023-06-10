package com.assignment.app;

public class Pallindrome {
    public static Boolean Pal(String a){
        {
            String rev = "";
            boolean ans = false;
            for (int i = a.length() - 1; i >= 0; i--) {
                rev = rev + a.charAt(i);
            }
            if (a.equals(rev)) {
                ans = true;
            }
            return ans;
        }

    }
}
