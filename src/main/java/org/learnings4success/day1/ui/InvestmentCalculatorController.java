package org.learnings4success.day1.ui;

import javafx.scene.control.TextField;

public class InvestmentCalculatorController {

    public TextField monthlyInvestment;
    public TextField expectedAnnualInterestRate;
    public TextField expectedNumberOfInvestmentYears;
    public TextField finalAmount;

    public void calculateFinalAmount() {
        double mi = Double.valueOf(monthlyInvestment.getText());
        double eAROI = Double.valueOf(expectedAnnualInterestRate.getText());
        double nOI = Double.valueOf(expectedNumberOfInvestmentYears.getText());

        double investmentNumberOfMonths = nOI * 12;
        double monthlyInterestRate = eAROI / 12 / 100;

        double calculatedValue = 0.0;
        for (int i = 0; i < investmentNumberOfMonths; i++) {
            calculatedValue = (1 + monthlyInterestRate) * (mi + calculatedValue);
        }

        finalAmount.setText(String.valueOf(calculatedValue));
    }
}
