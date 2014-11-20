package com.codeherenow.java7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Java 7 allows underscores between numeric types. Makes numbers go easy on the eye
 * and brain. Underscores (_) can ONLY be placed between digits or their representations (Hex, Octal or Binary).
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class UnderscoresNumericLiteralsJava7 {

    public static void main(String[] args) {
        int someNumber = 10_000_000;
        long millis = 72_000_000L;
        double gatesNetWorthBtc = 229_717_735.24761; // 1 BTC = 362.02 USD (When I made this)
        int green = 0x00_FF_00;

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
