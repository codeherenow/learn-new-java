package com.codeherenow.java8.defaultmethodsconflict.units;

import com.codeherenow.java8.defaultmethodsconflict.behaviors.AirAttacker;
import com.codeherenow.java8.defaultmethodsconflict.behaviors.WaterAttacker;

/**
 * This is the ONLY class that deals with conflicting default methods.
 * Don't bother with others, because they're here only for fun ;) Just like me :P
 *
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class HybridWarShip implements AirAttacker, WaterAttacker {

    @Override
    public void attack(Unit unit) {
        Unit.Type type = unit.getType();

        if (Unit.Type.AIR.equals(type)) {
            AirAttacker.super.attack(unit);
        } else if (Unit.Type.WATER.equals(type)) {
            WaterAttacker.super.attack(unit);
        } else {
            String who = getClass().getSimpleName();
            System.out.println(who + ": Cannot attack land units.");
        }
    }
}
