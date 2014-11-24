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

package com.codeherenow.java8.parameternames;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class ParameterNames {

    public static void main(String[] args) {
        Class<Alien> alienClass = Alien.class;

        Constructor<?>[] constructors = alienClass.getConstructors();
        Constructor<?> constructor = constructors[0];
        Parameter[] parameters = constructor.getParameters();

        /*
         * Normally the Java compiler discards the formal argument names to
         * save some memory footprint. If you want to retain that information in your
         * class files you have to compile with the -parameters flag.
         * (e.g.) 'javac -parameters'
         */
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getName());
        }
    }

}
