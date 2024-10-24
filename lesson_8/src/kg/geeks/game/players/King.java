package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class King extends Hero{
    public King(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAITAMA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for(Hero hero : heroes){
            int random = RPG_Game.random.nextInt(100)+1;
            if (random < 10){
                boss.setHealth(0);
                System.out.println("Saitama punch boss");
                break;
            } else {
                System.out.println("Saitama don't came");
            }
            break;
        }
    }
}
