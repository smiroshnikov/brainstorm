package com.company;

import java.util.Random;


public class GenerateWeapon {

    private Random r = new Random();
    static final int NATURALLIMIT = 20;
    static final int ARMEDLIMIT = 6;
    static final int EXOTICLIMIT = 4;
    static final int PLAYERWEAPONLIMIT = 8;

    private enum WeaponList {
        NATURAL(new String[]{"claws", "teeth", "fire breath", "tail swipe", "acid spit"}),
        ARMED(new String[]{"axe", "longsword", "spear"}),
        EXOTIC(new String[]{"whip", "estoc", "katana", "net"}),
        PLAYER_WEAPONS(new String[]{"crossbow", "longsword", "2H mace"});
        private final String[] weaponName;

        private WeaponList(String[] weaponList) {
            this.weaponName = weaponList;
        }
    }

    public String pickWeapon(String monster) {
        // TODO discuss with Max random ix , not all arrays have same length !
        switch (monster) {
            case "dragon": {
                int ix = r.nextInt(WeaponList.NATURAL.weaponName.length);
                return WeaponList.NATURAL.weaponName[ix];
            }
            case "orc": {
                int ix = r.nextInt(WeaponList.ARMED.weaponName.length);
                return WeaponList.ARMED.weaponName[ix];
            }
            case "shadow-assassin": {
                int ix = r.nextInt(WeaponList.EXOTIC.weaponName.length);
                return WeaponList.EXOTIC.weaponName[ix];
            }
            default: {
                int ix = r.nextInt(WeaponList.PLAYER_WEAPONS.weaponName.length);
                return WeaponList.PLAYER_WEAPONS.weaponName[ix];
            }

        }
    }

    public int provideWeaponDamage(String weapon) {
        switch (weapon) {
            case "axe": {
                return r.nextInt(ARMEDLIMIT) + 1;
                // TODO break ?!
            }
            case "longsword": {
                return r.nextInt(ARMEDLIMIT) + 1;
            }
            case "claws": {
                return r.nextInt(NATURALLIMIT) + 1;
            }
            case "teeth": {
                return r.nextInt(NATURALLIMIT) + 1;
            }
            case "fire breath": {
                return r.nextInt(NATURALLIMIT) + 1;
            }
            case "tail swipe": {
                return r.nextInt(NATURALLIMIT) + 1;
            }
            default: {
                return r.nextInt(PLAYERWEAPONLIMIT) + 1;
            }

        }

    }
}
