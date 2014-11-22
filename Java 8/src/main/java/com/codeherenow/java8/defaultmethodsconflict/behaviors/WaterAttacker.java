package com.codeherenow.java8.defaultmethodsconflict.behaviors;

import com.codeherenow.java8.defaultmethodsconflict.units.Unit;

import java.util.Random;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public interface WaterAttacker extends Attacker {

    @Override
    default void attack(Unit unit) {
        String who = getClass().getSimpleName();
        String result;

        Unit.Type type = unit.getType();
        if (Unit.Type.WATER.equals(type)) {
            result = new Random().nextBoolean()
                    ? "Aye Aye Captain! Torpedo on it's way :D"
                    : "Bring down the long boats, we're a toast :X";
        } else {
            result = "Cannot attack target on " + type;
        }

        System.out.println(who + ": " + result);
    }
}
