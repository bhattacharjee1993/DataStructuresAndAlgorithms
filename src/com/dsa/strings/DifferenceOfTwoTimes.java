package com.dsa.strings;

public class DifferenceOfTwoTimes {
    public static int difference(String time1, String time2)
    {
        int firstHr = Integer.parseInt(time1.substring(0,time1.indexOf(":")));
        int secondHr = Integer.parseInt(time2.substring(0,time2.indexOf(":")));

        int firstMin = Integer.parseInt(time1.substring(time1.indexOf(":")+1));
        int secondMin = Integer.parseInt(time2.substring(time2.indexOf(":") + 1));
        int diff = secondHr-firstHr;

        int firstMinutes = Math.min(firstHr*60 + firstMin,secondHr*60 + secondMin);
        int secondMinutes = Math.max(firstHr*60 + firstMin,secondHr*60 + secondMin);





        int originalDiff = Math.abs(firstMinutes-secondMinutes);
        int diff24hrs = (1440-secondMinutes) + (firstMinutes);

        int diff1 = Math.min(originalDiff,diff24hrs);
        return diff1;
    }
}
