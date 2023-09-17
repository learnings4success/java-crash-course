package org.learnings4success.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvestmentCalculatorTest {

    @Test
    public void testInvestmentCalculations() {
        var investmentNumberOfMonths = 24;
        var monthlyInvestmentAmount = 4000;
        var monthlyInterestRate = 0.002;

       var finalValue = InvestmentCalculator.calculateValue(investmentNumberOfMonths, monthlyInvestmentAmount, monthlyInterestRate);

        Assertions.assertNotEquals(finalValue, 0);
        Assertions.assertEquals(finalValue, 98437.20822311241);
    }
}
