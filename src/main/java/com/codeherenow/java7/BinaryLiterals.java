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

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class BinaryLiterals {

    public static void main(String[] args) {
        int hex = 0xF;
        int oct = 017;

        /*
         * Binary literals have to start with the prefix '0b' or '0B' and should be followed by either
         * '0' or '1'. Since binary is a representation numeric literal it is OK to have underscores (_)
         * between the digits.
         */
        int binary = 0b0000_1111;

        System.out.println(hex);
        System.out.println(oct);
        System.out.println(binary);
    }

}
