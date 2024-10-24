package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

import java.util.Random;

public class Deku extends Hero{
    public Deku(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.ABSORPTION_OF_LIFE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for(Hero hero : heroes){
            Random random = new Random();
            boolean a = random.nextBoolean();
            int b = RPG_Game.random.nextInt(20)+3;
            if (a == true){
                this.setDamage(getDamage() + b);
                System.out.println("Deku punch = " + this.getDamage());
                break;
            }
            break;
        }
    }
}
