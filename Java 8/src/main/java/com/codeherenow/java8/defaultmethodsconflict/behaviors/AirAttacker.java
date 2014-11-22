package com.codeherenow.java8.defaultmethodsconflict.behaviors;

import com.codeherenow.java8.defaultmethodsconflict.units.Unit;

import java.util.Random;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public interface AirAttacker extends Attacker {

    @Override
    default void attack(Unit unit) {
        String who = getClass().getSimpleName();
        String result;

        Unit.Type type = unit.getType();
        if (Unit.Type.AIR.equals(type)) {
            result = new Random().nextBoolean()
                    ? "KABOOOOM! Gone with the wind :D"
                    : "May day, may day... I'm hit I'm hit";
        } else {
            result = "Cannot attack target on " + type;
        }

        System.out.println(who + ": " + result);
    }

}
