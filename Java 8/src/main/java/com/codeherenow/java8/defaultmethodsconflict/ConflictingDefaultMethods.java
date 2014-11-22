package com.codeherenow.java8.defaultmethodsconflict;

import com.codeherenow.java8.defaultmethodsconflict.units.FighterJet;
import com.codeherenow.java8.defaultmethodsconflict.units.HybridWarShip;
import com.codeherenow.java8.defaultmethodsconflict.units.Soldier;
import com.codeherenow.java8.defaultmethodsconflict.units.WarShip;

/**
 * @author Ragunath Jawahar <www.codeherenow.com>
 */
public class ConflictingDefaultMethods {

    public static void main(String[] args) {
        // Our units
        FighterJet fighterJet = new FighterJet();
        Soldier soldier = new Soldier();
        WarShip warShip = new WarShip();

        // The enemies
        FighterJet enemyJet = new FighterJet();
        Soldier enemySoldier = new Soldier();
        WarShip enemyWarShip = new WarShip();

        // Attack!!!
        fighterJet.attack(enemyJet);
        soldier.attack(enemySoldier);
        warShip.attack(enemyWarShip);

        /**
         * The {@link com.codeherenow.java8.defaultmethodsconflict.units.HybridWarShip} is
         * the ONLY class that demonstrates conflicting default methods behavior.
         */
        // And now our Hybrid War Ship will attack the same
        // targets, because I am too lazy to create new enemies :P
        System.out.println();
        HybridWarShip hybridWarShip = new HybridWarShip();
        hybridWarShip.attack(enemyJet);
        hybridWarShip.attack(enemySoldier);
        hybridWarShip.attack(enemyWarShip);
    }

}
