package com.dsa.strings;

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


/*
You are given with a string : "123"
Assume that we are writing a library method to convert string to integer.
The method should convert string to integer and also contain checks whether the string can be converted to integer.
Eg:
Input : "214"
Output : 214 <- as integer

Input : "-213"
Output : 213

Input : "a22"
Output : "Arithmetic Exception - illegal string a22"

Input : "22.22"
Output : "Arithmetic Exception - cannot convert decimal points"

The range of numbers that can be converted are from - 2^32 to 2^32-1

 */