package com.codeherenow.java8.lambdas.functionalinterfaces;

/**
 * Functional Interfaces have exactly ONE abstract method, however they can have any
 * number of default methods. They are also called as Single Abstract Method Interfaces
 * or SAM Interfaces. If you decide to use an interface as a functional interface, mark
 * it with the {@link java.lang.FunctionalInterface} annotation that is part of JDK 8.
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
@FunctionalInterface
public interface BinaryOperation {
    int operate(int a, int b);

    default String describe() {
        return "I'm simple and zen.";
    }
}
