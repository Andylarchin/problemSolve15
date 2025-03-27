public class Cleric extends Character implements Healer, Attacker {
    private int healingPower;
    private int damage;

    public Cleric(String name, int health, int healingPower, int damage) {
        super(name, health);
        this.healingPower = healingPower;
        this.damage = damage;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void display() {
        System.out.println("Cleric: " + name + ", Health: " + health + ", Healing Power: " + healingPower + ", Damage: " + damage);
    }

    @Override
    public void heal(Character target) {
        target.setHealth(target.getHealth() + healingPower);
        System.out.println(name + " heals " + target.getName() + " for " + healingPower + " health!");
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - damage);
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
    }
}