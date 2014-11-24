package com.codeherenow.java8.lambdas.functionalinterfaces;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Calculator {
    private BinaryOperation addOperation;
    private BinaryOperation subtractOperation;

    public Calculator() {
        addOperation = new AddOperation();
        subtractOperation = new BinaryOperation() {

            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
    }

    public int add(int a, int b) {
        return addOperation.operate(a, b);
    }

    public int subtract(int a, int b) {
        return subtractOperation.operate(a, b);
    }

    /**
     * This implementation performs addition on two integers.
     */
    private class AddOperation implements BinaryOperation {

        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }

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
