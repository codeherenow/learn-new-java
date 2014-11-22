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

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public abstract class Unit {

    /**
     * Describes the type of unit. If it is a Land / Air / Water unit.
     */
    public enum Type {
        LAND, AIR, WATER
    }

    // Attributes
    private final Type type;

    // Constructor
    public Unit(Type type) {
        this.type = type;
    }

    // Getter for type
    public Type getType() {
        return type;
    }

    /**
     * This method always returns `true`. Fictitiously moves to the
     * given coordinates. (Just imagine :P)
     */
    public boolean move(int latitude, int longitude) {
        String affirmation = String.format(
                "Moving to %d, %d.", latitude, longitude);
        System.out.println(affirmation);
        return true;
    }

}
