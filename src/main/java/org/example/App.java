/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the principal amount?" );
        Scanner s = new Scanner(System.in);
        String principal = s.nextLine();
        System.out.println("What is the rate? ");
        String rate = s.nextLine();
        System.out.println("What is the number of years? ");
        String years = s.nextLine();
        System.out.println("What is the number of times the interest is compounded per year? ");
        String cyears = s.nextLine();
        Double p = Double.valueOf(principal);
        Double r = Double.valueOf(rate)/100.0;
        Double t = Double.valueOf(years);
        Double n = Double.valueOf(cyears);
        DecimalFormat d = new DecimalFormat("0.00");
        Double a = p * (1 + Math.pow((r/n), (n*t)));
        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + cyears + " times per year is $" + d.format(a));



    }
}
