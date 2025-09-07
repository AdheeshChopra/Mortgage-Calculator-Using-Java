package MortgageCalculator;
import java.util.*;
import java.text.*;

public class Calculator {
    public static void main(String[] args){
        int MonthsInYear=12;
        int Percent=100;

        Scanner sc=new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest=sc.nextFloat();
        float monthlyInterest=annualInterest/Percent/MonthsInYear;

        System.out.print("Period(Years): ");
        int years=sc.nextInt();
        int numberOfPayments = years*MonthsInYear;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))
                / (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
