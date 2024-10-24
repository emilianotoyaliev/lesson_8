package kg.geeks.game.players;

public class Reaper extends Hero{
    public Reaper(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.ADRENALIN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for(Hero hero : heroes){
            if(this.getHealth() < this.getHealth() * 0.15){
                this.setDamage(getDamage()*3);
                System.out.println("Damage boost X2");
                break;
            } else if (this.getHealth() == this.getHealth()*0.3) {
                this.setDamage(getDamage()*2);
                System.out.println("Damage boost X3");
                break;
            }
            break;
        }
    }
}
