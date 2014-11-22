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
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println(
                "Meow! Slurp, Slurp... milk likey likey... slurrrrp");
    }

    @Override
    public void walk() {
        System.out.println("Purr, OMG tripped over the mouse :P");
    }
}