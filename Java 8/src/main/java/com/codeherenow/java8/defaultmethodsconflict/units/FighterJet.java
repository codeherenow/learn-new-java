package com.codeherenow.java8.defaultmethodsconflict.units;

import com.codeherenow.java8.defaultmethodsconflict.behaviors.AirAttacker;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class FighterJet extends Unit implements AirAttacker {

    public FighterJet() {
        super(Type.AIR);
    }
}
