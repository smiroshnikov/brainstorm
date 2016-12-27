package com.company;

public class WeaponPicker {
    private enum MonsterWeapons {

        NATURAL(new String[]{"claws", "teeth", "breath"}),
        NON_NATURAL(new String[]{"axe", "sword", "spear"});
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
                return MonsterWeapons.NON_NATURAL.weaponName[0];

        }
    }
}
