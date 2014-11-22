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
