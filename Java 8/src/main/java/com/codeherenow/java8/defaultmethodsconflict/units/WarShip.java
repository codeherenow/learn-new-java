package com.codeherenow.java8.defaultmethodsconflict.units;

import com.codeherenow.java8.defaultmethodsconflict.behaviors.WaterAttacker;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class WarShip extends Unit implements WaterAttacker {

    public WarShip() {
        super(Type.WATER);
    }
}
