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
public class StringInSwitch {

    public static void main(String[] args) {
        String timerState = "READY";

        /*
         * Java 7 allows the use of {@link java.lang.String} within
         * switch statements. Here is an example that shows how to do it.
         *
         * PRO TIP: Switch statements on 'String' types are more performant
         * than their 'if.. then.. else..' counterparts.
         */
        switch (timerState.toUpperCase()) {
            case "READY":   doReady();      break;
            case "RUNNING": doRunning();    break;
            case "PAUSED":  doPaused();     break;
            case "RESET":   doReset();      break;

            default:
                String message = String.format(
                        "Is it %s? OMG, I haven't heard of that before!", timerState);
                throw new IllegalStateException(message);
        }

        /*
         * The following block demonstrates the use of if.. then.. else.. blocks
         * to make string comparisons in older version of Java (up to 1.6).
         */
        /*
        if ("READY".equals(timerState)) {
            doReady();
        } else if ("RUNNING".equals(timerState)) {
            doRunning();
        } else if ("PAUSED".equals(timerState)) {
            doPaused();
        } else if ("RESET".equals(timerState)) {
            doReset();
        } else {
            String message = String.format(
                    "Is it %s? OMG, I haven't heard of that before!", timerState);
            throw new IllegalStateException(message);
        }
        */
    }

    private static void doReady() {
        System.out.println("I'm READY, bring it on :X");
    }

    public static void doRunning() {
        System.out.println("Catch me if you can! Ha ha...");
    }

    public static void doPaused() {
        System.out.println("I'm PASSED :D, looking for inner peace :)");
    }

    public static void doReset() {
        System.out.println("I have no clue what just happened O_o");
    }

}
