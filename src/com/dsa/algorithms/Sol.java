package com.dsa.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sol {
   public static List<String> ans = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        int openCount = n;
        int closeCount = n;



        return getValidParanthesis(openCount,closeCount,"");
    }

    public static List<String> getValidParanthesis(int open, int close, String value){

        if(open==0 && close ==0){
            //System.out.println(value);
            ans.add(value);
        }


        if(open>close){
            return null;
        }

        if(open > 0){
            getValidParanthesis(open-1,close,value+"(");
        }

        if(close > 0){
            getValidParanthesis(open,close-1,value+")");
        }

        return ans;
    }
}