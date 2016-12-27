package com.company;

import java.util.Random;

public class Monster {
    private Random r = new Random();
    private GenerateWeapon weapon = new GenerateWeapon();

    private enum Monsters {
        HUMANOID(new String[]{"goblin", "kobold", "orc", "lizardman"}),
        DRAGON(new String[]{"dragon", "dracolich", "draconid"}),
        SHAPELESS(new String[]{"ooze", "gelatinous cube"});
        private final String[] monsterType;

        private Monsters(String[] monsterType) {
            this.monsterType = monsterType;
        }
    }

    private String pickMonster(Monsters monsters) {
        switch (monsters) {
            case DRAGON: {
                int ix = r.nextInt(Monsters.DRAGON.monsterType.length);
                return Monsters.DRAGON.monsterType[ix];
            }
            case HUMANOID: {
                int ix = r.nextInt(Monsters.HUMANOID.monsterType.length);
                return Monsters.HUMANOID.monsterType[ix];
            }
            case SHAPELESS: {
                int ix = r.nextInt(Monsters.SHAPELESS.monsterType.length);
                return Monsters.SHAPELESS.monsterType[ix];
            }
            default:
                return null;
        }
    }


}


