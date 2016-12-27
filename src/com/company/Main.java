package com.company;

public class Main {

    public static void main(String[] args) {

        WeaponPicker weaponPicker = new WeaponPicker();
        int i = 0;

        do {
            // Cry, you little bitch !
            String x = weaponPicker.pickWeapon("dragon");
            System.out.printf("[dragon] dealt %d point of damage with %s %n", weaponPicker.provideWeaponDamage(x), x.toUpperCase());
            /*System.out.printf("[dragon] is attacking  with %s%n he does %d points of damage !%n", weaponPicker.pickWeapon("dragon").toUpperCase(),
                  weaponPicker.provideWeaponDamage(weaponPicker.pickWeapon("dragon"))); */
            x = weaponPicker.pickWeapon("orc");
            // TODO I need to prevent this re-instantiation of 'x'
            System.out.printf("[orc] dealt %d point of damage with %s %n", weaponPicker.provideWeaponDamage(x), x.toUpperCase());
            x = weaponPicker.pickWeapon("player");
            System.out.printf("[player] dealt %d point of damage with %s %n", weaponPicker.provideWeaponDamage(x), x.toUpperCase());
            x = weaponPicker.pickWeapon("shadow-assassin");
            System.out.printf("[assassin] dealt %d point of damage with %s %n", weaponPicker.provideWeaponDamage(x), x.toUpperCase());
            i += 1;
        } while (i < 10);

    }
}
