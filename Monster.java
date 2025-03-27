/**
 * Purpose: Represents a monster with health, name, type and damage.
 * Implements the Attacker interface to allow attacking other characters.
 * 
 * @author  ITSC 1213
 * @version Mar 23, 2025
 */
public class Monster extends Character implements Attacker {
    private String type;
    private int damage;

    public Monster(String name, int health, String type, int damage) {
        super(name, health);
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void display() {
        System.out.println("Monster: " + name + ", Health: " + health + ", Type: " + type + ", Damage: " + damage);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - damage);
        System.out.println(name + " attacks " + target.getName() + " with a ferocious strike for " + damage + " damage!");
    }
}