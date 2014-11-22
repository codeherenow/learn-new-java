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
