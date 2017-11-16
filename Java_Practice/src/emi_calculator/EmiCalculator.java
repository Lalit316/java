package emi_calculator;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by l on 2/27/2017.
 */
public class EmiCalculator {
    public void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("...................EMI CALCULATIOR...................\n\n");
        System.out.println("Enter the loan amount?");
        double loan = s.nextDouble();
        System.out.println("Enter rate of interest?");
        double rate = s.nextDouble();
        System.out.println("Enter the duration in number of months?");
        double duration = s.nextDouble();
        double e;
        double r = rate/12/100;
        double p = pow((1 + r), duration);
        e = loan * r * (p / (p - 1));
        System.out.println("\n\nLoan Amount(Rs)    : "+loan );
        System.out.println("Rate of Interest(%): "+rate);
        System.out.println("Term(months)       : "+duration);
        System.out.println("\nTotal Monthly Payment (EMI): "+e);
    }
}
