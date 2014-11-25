package com.codeherenow.java8.lambdas;

import com.codeherenow.java8.lambdas.functionalinterfaces.BinaryOperation;

/**
 * The general syntax of lambda expressions is 'parameters -> body'. The new type
 * inference system takes care of inferring types, so parameter types are optional.
 * If the expression returns a value, the 'return' keyword is optional as well. Don't
 * bother with the enclosing braces {} if you have only one statement.
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Calculator {
    private BinaryOperation addOperation;
    private BinaryOperation subtractOperation;

    public Calculator() {
        addOperation = (a, b) -> a + b;
        subtractOperation = (a, b) -> a - b;

        /*
        addOperation = new AddOperation();
        subtractOperation = new BinaryOperation() {

            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        */
    }

    public int add(int a, int b) {
        return addOperation.operate(a, b);
    }

    public int subtract(int a, int b) {
        return subtractOperation.operate(a, b);
    }

    /*
     * The AddOperation class implements the BinaryOperation interface
     * and adds two integers.
     */
    /*
    private class AddOperation implements BinaryOperation {

        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }
    */

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Input
        int a = 1945; int b = 2056;
        String formatString = "%d %s %d = ";

        // Addition
        String message = String.format(formatString, a, "+", b);
        System.out.println(message + calculator.add(a, b));

        // Subtraction
        message = String.format(formatString, a, "-", b);
        System.out.println(message + calculator.subtract(a, b));
    }
}
