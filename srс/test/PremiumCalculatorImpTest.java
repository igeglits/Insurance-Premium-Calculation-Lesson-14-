


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorImpTest {

PremiumCalculatorImp premiumCalculator =new PremiumCalculatorImp();


    @Test
    void shouldCalculatePremiumByAcceptanceCriteriaDefaultCoef() {
        assertEquals(new BigDecimal("2.28"), premiumCalculator.calculator(PolicyTestData.example1()));
    }

    @Test
    void shouldCalculatePremiumByAcceptanceCriteriaHighCoef() {
        assertEquals(new BigDecimal("17.13"), premiumCalculator.calculator(PolicyTestData.example2()));
    }
}