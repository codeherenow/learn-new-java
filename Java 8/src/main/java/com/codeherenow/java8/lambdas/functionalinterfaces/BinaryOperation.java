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
