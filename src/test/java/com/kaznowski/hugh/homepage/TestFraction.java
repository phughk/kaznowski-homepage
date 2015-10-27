package com.kaznowski.hugh.homepage;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Hugh on 27/10/2015.
 */
public class TestFraction {

    @Test(expected = ArithmeticException.class)
    public void testDiv0Fraction() {
        new Fraction(1, 0);
    }

}
