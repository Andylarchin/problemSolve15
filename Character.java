public abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
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

    public abstract void display();

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Character)) return false;

        Character c = (Character) other;

        return this.name.equalsIgnoreCase(c.name);
    }
}
