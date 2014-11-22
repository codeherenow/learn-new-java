package com.codeherenow.java8.defaultmethodsconflict.behaviors;

import com.codeherenow.java8.defaultmethodsconflict.units.Unit;

import java.util.Random;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public interface LandAttacker extends Attacker {

    @Override
    default void attack(Unit unit) {
        String who = getClass().getSimpleName();
        String result;

        Unit.Type type = unit.getType();
        if (Unit.Type.LAND.equals(type)) {
            result = new Random().nextBoolean()
                    ? "Pew pew pew... Bang bang... RIP"
                    : "Tell my wife that I love her :'(";
        } else {
            result = "Cannot attack target on " + type;
        }

        System.out.println(who + ": " + result);
    }

}
