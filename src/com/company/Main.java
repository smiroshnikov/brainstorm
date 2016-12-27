package com.company;

public class Main {

    public static void main(String[] args) {

        WeaponPicker weaponPicker = new WeaponPicker();
        int i = 0;

        do {
            // Cry, you little bitch !
            System.out.printf("[dragon] is attacking  with %s%n", weaponPicker.pickWeapon("dragon").toUpperCase());
            System.out.printf("[orc] is attacking with %s%n", weaponPicker.pickWeapon("orc").toUpperCase());
            System.out.printf("[player] is attacking with %s%n", weaponPicker.pickWeapon("human").toUpperCase());
            System.out.printf("[assassin] is attacking with %s%n", weaponPicker.pickWeapon("shadow-assassin").toUpperCase());
            i += 1;
        } while (i < 10);

    }
}
