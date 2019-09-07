package com.Selman;


import java.text.DecimalFormat;

public class OverLoading {
    double result;

    DecimalFormat df = new DecimalFormat("#.###");

    void demo (int a)
    {
        System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
        System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
        result = a * a;
        System.out.println("The result of a * a is: "+Double.parseDouble(df.format(result)));
        //System.out.println("double a: " + a);
        //return Double.parseDouble(df.format(a*a));
        return result;
    }
}
