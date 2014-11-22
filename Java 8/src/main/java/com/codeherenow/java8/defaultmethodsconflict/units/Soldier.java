package com.codeherenow.java8.defaultmethodsconflict.units;

import com.codeherenow.java8.defaultmethodsconflict.behaviors.LandAttacker;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class Soldier extends Unit implements LandAttacker {

    public Soldier() {
        super(Type.LAND);
    }
}
