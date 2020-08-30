package com.dsa.algorithms;

public class StringToInt {

    public static int myAtoi(String str){

        str= str.trim();
        String result= "";
        int res=0;
        for (char c:str.toCharArray()
             ) {
            if(!Character.isDigit(c) && c!='-'){
                return 0;
            }
            if(Character.isDigit(c) || c=='-' && c!=' '){
                result= result+c;
            }
            res = (int) Long.parseLong(result);
        }
        return res;
    }
}
