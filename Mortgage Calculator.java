package MortgageCalculator;
import java.util.*;
import java.text.*;

public class MortgageCalculator {
    public static void main(String[] args){
        int MonthsInYear=12;
        int Percent=100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.print("Principal: ");
            principal = sc.nextInt();
            if(principal>=1000 && principal<=1000000) break;
            System.out.print("Enter a valid value between 1000 and 1000000: ");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = sc.nextFloat();
            if(annualInterest>=1 && annualInterest<=30){
                monthlyInterest = annualInterest / Percent / MonthsInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true) {
            System.out.print("Period(Years): ");
            int years = sc.nextInt();
            if(years>=1 && years<=30) {
                numberOfPayments = years * MonthsInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                / (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
