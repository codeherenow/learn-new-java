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

package com.codeherenow.java8.defaultmethods;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public interface Animal {
    void eat();
    void walk();

    /*
     * In Java 8, you can have default methods that can have a method
     * body. An interface is still different from an abstract class because
     * it cannot have instance variables. Also, you can inherit from a single
     * concrete / abstract class but can implement any number of interfaces ;)
     */
    default void sleep() {
        System.out.println("Zzzzzzzzzzzzzzz...");
    }
}
