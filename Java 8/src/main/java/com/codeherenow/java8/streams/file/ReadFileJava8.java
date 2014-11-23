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

package com.codeherenow.java8.streams.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class ReadFileJava8 {

    public static void main(String[] args) {
        Path path = Paths.get("files", "streams-read-file.txt");

        try {
            StringBuilder stringBuilder = new StringBuilder();

            // Get a stream using the lines() method, then go LAMBDA like crazy! Muhahaha... :D
            Files.lines(path).forEach(line -> stringBuilder.append(line).append("\n"));

            // Print file contents
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
