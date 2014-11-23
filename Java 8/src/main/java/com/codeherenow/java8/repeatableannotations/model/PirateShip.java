package com.codeherenow.java8.repeatableannotations.model;

import com.codeherenow.java8.repeatableannotations.annotations.Parrot;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class PirateShip {

    @Parrot(alert = Sighting.ICEBERG)
    private Lookout lookout;

    @Parrot(alert = Sighting.NAVY_SHIP)
    private PirateCaptain pirateCaptain;

}
