/*
 * Copyright 2014, Ragunath Jawahar (www.codeherenow.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeherenow.java7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class UnderscoresInNumericLiterals {

    public static void main(String[] args) {

        /*
         * Java 7 allows underscores between numeric types. Makes numbers
         * go easy on the eye and brain. Underscores (_) can ONLY be placed
         * between digits or their representations (Hex, Octal or Binary).
         */
        int someNumber = 10_000_000;
        long millis = 72_000_000L;
        double gatesNetWorthBtc = 229_717_735.24761; // 1 BTC = 362.02 USD (When I made this)
        int green = 0x00_FF_00;

        /*
         * Underscores are illegal inside numeric types before Java 7.
         * The numbers in the code appear long and verbose.
         */
        /*
        int someNumber = 10000000;
        long millis = 72000000L;
        double gatesNetWorthBtc = 229717735.24761; // 1 BTC = 362.02 USD (When I made this)
        int green = 0x00FF00;
        */

        printInItalianFormat(someNumber);
        printInHours(millis);
        printWithTwoDecimals(gatesNetWorthBtc);
        printColor(green);
    }

    private static void printInItalianFormat(int someNumber) {
        // Decimal int
        String italianFormat = NumberFormat
                .getNumberInstance(Locale.ITALIAN)
                .format(someNumber);
        System.out.println(italianFormat);
    }

    private static void printInHours(long millis) {
        System.out.println(TimeUnit.MILLISECONDS.toHours(millis) + " Hours");
    }

    private static void printWithTwoDecimals(double gatesNetWorthBtc) {
        System.out.println(String.format("BTC %.02f", gatesNetWorthBtc));
    }

    private static void printColor(int color) {
        System.out.println(color);
    }

}
