package org.learnings4success.day1;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InvestmentCalculator {

    // A = P x (1 + r)n
    public static void main(String[] args) {
        System.out.println("Welcome to our Investment Calculator");
        System.out.println();

        System.out.println("Would you like to calculate your investment with interest y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (input.equalsIgnoreCase("y")) {
            System.out.println("Enter expected monthly investment: ");
            int monthlyInvestmentAmount = scanner.nextInt();
            System.out.println("Enter expected number of years for investment: ");
            int yearsOfInvestment = scanner.nextInt();
            System.out.println("Enter expected Annual interest: ");
            double expectedAnnualRateOfInterest = Double.valueOf(scanner.next());

            int investmentNumberOfMonths = yearsOfInvestment * 12;
            double monthlyInterestRate = expectedAnnualRateOfInterest / 12 / 100;

            System.out.println(monthlyInterestRate);

            double calculatedValue = calculateValue(investmentNumberOfMonths, monthlyInvestmentAmount, monthlyInterestRate);

            Locale locale = new Locale("de", "de");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            System.out.println("After "+ yearsOfInvestment + " years of investment you will get : "+ currencyFormatter.format(calculatedValue));
            System.out.println("After "+ yearsOfInvestment + " years of investment you will get : "+ calculatedValue);

            System.out.println("Would you like to continue for next investment y/n");
            input = scanner.next();
        }
    }

    public static double calculateValue(int investmentNumberOfMonths, int monthlyInvestmentAmount, double monthlyInterestRate) {
        double calculatedValue = 0.0;
        for (int i = 0; i < investmentNumberOfMonths; i++) {
            calculatedValue = (1 + monthlyInterestRate) * (monthlyInvestmentAmount + calculatedValue);
        }
        return calculatedValue;
    }
}
