package com.dsa.foobar;

public class DoomsDayFuel {



    static class Fraction
    {
        public int numerator;
        public int denominator;

        Fraction(int numerator, int denominator)
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    static private Fraction convertDecimalToFraction(double x){
        if (x < 0){
            return  convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        if (x < tolerance) {
            return new Fraction(0,1);
        }
        double h1=1; double h2=0;
        double k1=0; double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1; h1 = a*h1+h2; h2 = aux;
            aux = k1; k1 = a*k1+k2; k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);

        return new Fraction((int)h1, (int)k1);
    }

    static int gcd(int num1, int num2)
    {
        return computeGCD(Math.abs(num1), Math.abs(num2));
    }

    private static int computeGCD(int x, int y) {
        if (y == 0)
        return x;
        return computeGCD(y, x%y);
    }

    static Fraction simplify(int x, int y)
    {
        int g  = gcd(x, y);
        return new Fraction(x/g, y/g);
    }

    static int lcm(int x, int y)
    {
        return x*y/gcd(x,y);
    }

    public static int[][] transpose(int matrix[][])
    {
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<10;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
    }

    public static int[][] inverse(int[][] matrix)
    {
        int[][] tmat = transpose(matrix);
//        int[] mat_inv = new int[];
//        mat_inv = []
//        for i in range(len(tmat)):
//        values = [Fraction(int(i==j), 1) for j in range(len(mat))]
//        mat_inv.append(gauss_elmination(tmat, values))
        return tmat;
    }



    public static int[] solution(int[][] input )
    {
        return new int[]{};
    }
}
