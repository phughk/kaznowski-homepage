package com.kaznowski.hugh.homepage;

/**
 * Created by Hugh on 27/10/2015.
 */
public class Fraction {
    final int num;
    final int den;
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    /**
     * Get the total value of the fraction
     * @return
     */
    public double getVal() {
        return num/den;
    }

    /**
     * Get the 'whole' number
     * @return
     */
    public int whole() {
        return num/den;
    }

    public double rem() {
        return num%den;
    }
}
