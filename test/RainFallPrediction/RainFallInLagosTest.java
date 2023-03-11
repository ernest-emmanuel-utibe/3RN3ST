package RainFallPrediction;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class RainFallInLagosTest {
    @Test
    public void numberOfRainFallInJanuaryTest() {
        double numberOfRainFallInJanuary = RainFallInLagos.numberOfRainFall("January", 2);
        assertEquals(15.0, numberOfRainFallInJanuary);
    }

    @Test
    public void numberOfRainFallInFebruaryTest() {
        double numberOfRainFallInFebruary = RainFallInLagos.numberOfRainFall("February", 3);
        assertEquals(40.0, numberOfRainFallInFebruary);
    }

    @Test
    public void numberOfRainFallInMarchTest() {
        double numberOfRainFallInMarch = RainFallInLagos.numberOfRainFall("March", 6);
        assertEquals(75.0, numberOfRainFallInMarch);
    }

    @Test
    public void numberOfRainFallInAprilTests() {
        double numberOfRainFallInApril = RainFallInLagos.numberOfRainFall("April", 9);
        assertEquals(140.0, numberOfRainFallInApril);
    }

    @Test
    public void numberOfRainFallInMayTests() {
        double numberOfRainFallInMay = RainFallInLagos.numberOfRainFall("May", 12);
        assertEquals(205.0, numberOfRainFallInMay);
    }

    @Test
    public void numberOfRainFallInJuneTests() {
        double numberOfRainFallInJune = RainFallInLagos.numberOfRainFall("June", 16);
        assertEquals(310.0, numberOfRainFallInJune);
    }

    @Test
    public void numberOfRainFallInJulyTests() {
        double numberOfRainFallInJuly = RainFallInLagos.numberOfRainFall("July", 13);
        assertEquals(255.0, numberOfRainFallInJuly);
    }

    @Test
    public void numberOfRainFallInAugustTests() {
        double numberOfRainFallInAugust = RainFallInLagos.numberOfRainFall("August", 12);
        assertEquals(110.0, numberOfRainFallInAugust);
    }

    @Test
    public void numberOfRainFallInSeptemberTests() {
        double numberOfRainFallInSeptember = RainFallInLagos.numberOfRainFall("September", 13);
        assertEquals(165.0, numberOfRainFallInSeptember);
    }

    @Test
    public void numberOfRainFallInOctoberTests() {
        double numberOfRainFallInOctober = RainFallInLagos.numberOfRainFall("October", 11);
        assertEquals(135.0, numberOfRainFallInOctober);
    }

    @Test
    public void numberOfRainFallInNovemberTests() {
        double numberOfRainFallInNovember = RainFallInLagos.numberOfRainFall("November", 5);
        assertEquals(55.0, numberOfRainFallInNovember);
    }

    @Test
    public void numberOfRainFallInDecemberTests() {
        double numberOfRainFallInDecember = RainFallInLagos.numberOfRainFall("December", 1);
        assertEquals(20.0, numberOfRainFallInDecember);
    }

}