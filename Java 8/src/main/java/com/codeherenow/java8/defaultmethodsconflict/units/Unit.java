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
