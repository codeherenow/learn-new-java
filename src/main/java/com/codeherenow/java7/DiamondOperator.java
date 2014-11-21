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

import java.util.*;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class DiamondOperator {

    public static void main(String[] args) {

        /*
         * Diamond operator '<>' in Java 7 means a lot less typing and lot
         * more freedom while working with generic types. You don't have
         * to specify the type parameters in the constructor when you
         * instantiate an object.
         */
        List<String> names = new ArrayList<>();
        Map<String, ? extends Map<Long, Class<?>>> complexMap =
                new HashMap<>();

        /*
         * Up to Java 6, generics were verbose. They required redundant
         * parameter types in the constructor when instantiating objects.
         */
        /*
        List<String> names = new ArrayList<String>();
        Map<String, ? extends Map<Long, Class<?>>> complexMap =
                new HashMap<String, TreeMap<Long, Class<?>>>();
        */
    }

}
