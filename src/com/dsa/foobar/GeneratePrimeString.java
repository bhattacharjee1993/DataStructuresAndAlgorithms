package com.dsa.foobar;

public class GeneratePrimeString {

    public static String solution(int num)
    {
        if (num < 0 || num> 10000)
            return "";
        StringBuilder primeNums = new StringBuilder();

        int i=2;
        while (primeNums.length() < (num+5))
        {
            if (isPrime(i))
            {
                primeNums.append(i);
            }
            i++;
        }
        System.out.println(primeNums.toString());
        return primeNums.toString().substring(num,num+5);
    }

    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
