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

package com.codeherenow.java8.repeatableannotations;

import com.codeherenow.java8.repeatableannotations.annotations.Parrot;
import com.codeherenow.java8.repeatableannotations.annotations.Parrots;
import com.codeherenow.java8.repeatableannotations.model.PirateShip;

import java.lang.reflect.Field;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class RepeatableAnnotations {

    public static void main(String[] args) throws NoSuchFieldException {
        Class<PirateShip> pirateShipClass = PirateShip.class;

        // Lookout
        System.out.println("-- Lookout --");
        Field lookout = pirateShipClass.getDeclaredField("lookout");
        Parrot lookOutParrot = lookout.getAnnotation(Parrot.class);
        System.out.println(lookOutParrot.alert());
        System.out.println();

        // Pirate Captain
        System.out.println("-- Pirate Captain --");
        Field pirateCaptain = pirateShipClass.getDeclaredField("pirateCaptain");

        /*
         * If you are using repeatable annotations in your project, you should look for both the
         * annotation types - the contained (Parrots.class, in this context) and the containing
         * class (Parrots.class).
         */
        Parrots pirateCaptainParrots = pirateCaptain.getAnnotation(Parrots.class);
        Parrot[] parrots = pirateCaptainParrots.value();
        for (Parrot parrot : parrots) {
            System.out.println(parrot.alert());
        }
    }

}
