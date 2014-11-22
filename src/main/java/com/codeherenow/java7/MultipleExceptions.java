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

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class MultipleExceptions {

    public static void main(String[] args) {
        File file = new File("files/multiple-exceptions.txt");

        /*
         * Java 7 comes with a new multi-catch feature that allows you to group exceptions
         * that you want to handle in a unique manner. Any number of exceptions can be grouped
         * together with the types separated by the `|` symbol.
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String fileContents = readFile(reader);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            // Digest
            byte[] digest = messageDigest.digest(fileContents.getBytes());
            String base64Digest = Base64.getEncoder().encodeToString(digest);

            // Print SHA-256
            System.out.println(base64Digest);
        } catch (NoSuchAlgorithmException | FileNotFoundException e) {
            log(e);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * In older versions of Java if you want to handle different exceptions differently,
         * you need to have individual catch blocks. Which may result in duplicate code
         * (Yeah, you can use a method, I hear you :)). Or you may want to do ugly things like using
         * a super class / `if` condition / `instanceof` comparisons, etc.,
         */
        /*
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String fileContents = readFile(reader);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            // Digest
            byte[] digest = messageDigest.digest(fileContents.getBytes());
            String base64Digest = Base64.getEncoder().encodeToString(digest);

            // Print SHA-256
            System.out.println(base64Digest);
        } catch (NoSuchAlgorithmException e) {
            log(e);
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            log(e);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    private static String readFile(BufferedReader reader) throws IOException {
        // Read file
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append("\n");
        }
        return builder.toString();
    }

    private static void log(Throwable throwable) {
        String message = String.format(
                "Gulp, Gulp! I just swallowed an exception :P\n%s", throwable.toString());
        System.out.println(message);
    }

}
