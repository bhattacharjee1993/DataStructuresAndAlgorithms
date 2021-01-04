package com.dsa.foobar;

public class PegsGearDestruction {

    public static int[] solution(int pegs[]) {
        if (pegs == null || pegs.length < 2 )
            return new int[]{-1, -1};
        int n = pegs.length;

        boolean isOddLength = n % 2 != 0;
        long gearOneSize = 0;

        int intermediateSignValue = 1;

        if (isOddLength)
        {
            gearOneSize = -pegs[0] - pegs[n-1];
        }
        else
        {
            gearOneSize = -pegs[0] + pegs[n-1];
        }

        if (n > 2)
        {
            for (int i = 1; i < n-1; i++) {
                gearOneSize += 2 * (intermediateSignValue) * pegs[i];
                intermediateSignValue *= -1;
            }
        }

        int divisor = 1;
        gearOneSize *= 2;
        if (!isOddLength) {
            if (gearOneSize % 3 == 0) {
                gearOneSize /= 3;
            } else {
                divisor = 3;
            }
        }

        System.out.println(gearOneSize);

        return isValid(gearOneSize/(double)3.0, pegs) ? new int[]{(int)gearOneSize, divisor} : new int[]{-1,-1};

    }

    public static int[] answer(int[] pegs) {

        int gearLastSize = 0;
        int intermediateSignValue = 1;
        for (int i = 1; i < pegs.length; i++) {
            int singleDistance = pegs[i] - pegs[i - 1];
            gearLastSize += (intermediateSignValue * singleDistance);
            intermediateSignValue *= -1;
        }
        int gearOneSize = gearLastSize * 2;
        int divisor = 1;

        if ((pegs.length % 2 == 0)) {
            if (gearOneSize % 3 == 0) {
                gearOneSize /= 3;
            } else {
                divisor = 3;
            }
        }

        return isValid( gearOneSize / divisor, pegs)
                ? new int[] { gearOneSize, divisor }
                : new int[] { -1, -1 };
    }

    private static int gearLastSize(int[] pegs) {
        int sign = 1;
        int netDistance = 0;
        for (int i = 1; i < pegs.length; i++) {
            int dist = pegs[i] - pegs[i - 1];
            netDistance += (sign * dist);
            sign = -sign;
        }
        return netDistance;
    }

    private static boolean isValidForGears(int[] pegs, int firstGearSize) {
        int gearSize = firstGearSize;
        for (int i = 1; i < pegs.length; i++) {
            int distance = pegs[i] - pegs[i - 1];
            if (gearSize > distance - 1 || gearSize < 1) {
                return false;
            }
            gearSize = distance - gearSize;
        }
        return true;
    }

    static  boolean isValid(double g1Radius , int[] pegs){
        int centreDistance;
        double nextRadius;
        double currentRadius = g1Radius;
        for (int i = 0 ; i < pegs.length-2 ; i++) {
            centreDistance = pegs[i+1] - pegs[i];
            nextRadius = centreDistance - currentRadius;
            if(currentRadius < 1 || nextRadius < 1)
            {
                return  false;
            }
            else
            {
                currentRadius = nextRadius;
            }
        }
        return true;
    }
}
