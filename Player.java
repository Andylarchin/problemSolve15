public class Player extends Character implements Attacker {

    private String name;
    private int health;
    private int level;
    private String specialAbility;

    public Player(String name, int health, int level, String specialAbility) {
        super(name, health); 
        this.name = name;
        this.health = health;
        this.level = level;
        this.specialAbility = specialAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    @Override
    public void display() {
        System.out.println("Player: " + name + ", Health: " + health + ", Level: " + level + ", Ability: " + specialAbility);
    }

    @Override
    public void attack(Character target) {
        int damage = level * 5; // Damage is based on the player's level
        target.setHealth(target.getHealth() - damage);
        System.out.println(name + " attacks " + target.getName() + " with " + specialAbility + " for " + damage + " damage!");
    }

}