package com.codeherenow.java8.repeatableannotations;

import com.codeherenow.java8.repeatableannotations.annotations.Parrot;
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
        Parrot pirateCaptainParrot = pirateCaptain.getAnnotation(Parrot.class);
        System.out.println(pirateCaptainParrot.alert());
    }

}
