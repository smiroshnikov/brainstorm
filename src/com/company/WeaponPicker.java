package com.company;

import java.util.Random;


public class WeaponPicker {

    private Random r = new Random();

    private enum MonsterWeapons {

        NATURAL(new String[]{"claws", "teeth", "breath"}),
        NON_NATURAL(new String[]{"axe", "sword", "spear"}),
        EXOTIC(new String[]{"whip", "estoc", "scythe", "net"}),
        PLAYER_WEAPONS(new String[]{"crossbow", "longsword", "2H mace"});
        private final String[] weaponName;

        private MonsterWeapons(String[] weaponName) {
            this.weaponName = weaponName;
        }
    }

    public String pickWeapon(String monster) {
        switch (monster) {
            case "dragon":
                return MonsterWeapons.NATURAL.weaponName[2]; // this should be random
            case "orc":
                return MonsterWeapons.NON_NATURAL.weaponName[0];
            default:
                return MonsterWeapons.PLAYER_WEAPONS.weaponName[2];

        }
    }
}
