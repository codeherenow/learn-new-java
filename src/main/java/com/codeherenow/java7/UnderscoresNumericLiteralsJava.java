package com.codeherenow.java7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Underscores are illegal inside numeric types before Java 7. The numbers in the code
 * look long and verbose.
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class UnderscoresNumericLiteralsJava {

    public static void main(String[] args) {
        int someNumber = 10000000;
        long millis = 72000000L;
        double gatesNetWorthBtc = 229717735.24761; // 1 BTC = 362.02 USD (When I made this)
        int green = 0x00FF00;

        printInItalianFormat(someNumber);
        printInHours(millis);
        printWithTwoDecimals(gatesNetWorthBtc);
        print(green);
    }

    private static void printInItalianFormat(int tenMillion) {
        // Decimal int
        String italianFormat = NumberFormat
                .getNumberInstance(Locale.ITALIAN)
                .format(tenMillion);
        System.out.println(italianFormat);
    }

    private static void printInHours(long millis) {
        System.out.println(TimeUnit.MILLISECONDS.toHours(millis) + " Hours");
    }

    private static void printWithTwoDecimals(double gatesNetWorthBtc) {
        // Floating point
        System.out.println(String.format("BTC %.02f", gatesNetWorthBtc));
    }

    private static void print(int twoFiveFive) {
        // Hex
        System.out.println(twoFiveFive);
    }

}
