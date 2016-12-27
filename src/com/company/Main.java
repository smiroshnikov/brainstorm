package com.company;

public class Main {

    public static void main(String[] args) {

        GenerateWeapon generateWeapon = new GenerateWeapon();
        int i = 0;

        do {
            // To test randomness
            String x = generateWeapon.pickWeapon("dragon");
            System.out.printf("[dragon] dealt %d points of damage with %s %n", generateWeapon.provideWeaponDamage(x), x.toUpperCase());
            /*System.out.printf("[dragon] is attacking  with %s%n he does %d points of damage !%n", generateWeapon.pickWeapon("dragon").toUpperCase(),
                  generateWeapon.provideWeaponDamage(generateWeapon.pickWeapon("dragon"))); */
            x = generateWeapon.pickWeapon("orc");
            // TODO I need to prevent this re-instantiation of 'x'
            System.out.printf("[orc] dealt %d points of damage with %s %n", generateWeapon.provideWeaponDamage(x), x.toUpperCase());
            x = generateWeapon.pickWeapon("player");
            System.out.printf("[player] dealt %d points of damage with %s %n", generateWeapon.provideWeaponDamage(x), x.toUpperCase());
            x = generateWeapon.pickWeapon("shadow-assassin");
            System.out.printf("[assassin] dealt %d points of damage with %s %n", generateWeapon.provideWeaponDamage(x), x.toUpperCase());
            i += 1;
        } while (i < 10);

    }
}
