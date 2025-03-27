import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", 100, 5, "Fireball");
        Monster monster1 = new Monster("Goblin", 50, "Beast", 15);
        Cleric cleric1 = new Cleric("Eli", 80, 20, 10);

        Character target = new Monster("Orc", 60, "Warrior", 20);

        System.out.println("\nTesting simulate - Attack:");
        simulateAttack(player1, target); 
        simulateAttack(monster1, target); 

        System.out.println("\nTesting simulate - Heal:");
        simulateHeal(cleric1, target); 

        System.out.println("\nFinal State of Target:");
        target.display();
    }

    public static void simulateAttack(Attacker attacker, Character target) {
        System.out.println("Simulating attack...");
        attacker.attack(target);
    }


    public static void simulateHeal(Healer healer, Character target) {
        System.out.println("Simulating heal...");
        healer.heal(target);
    }


    public static void showCharacterInfo(ArrayList<Character> characters) {
        System.out.println("Character Information:");
        for (Character character : characters) {
            character.display();
        }
    }
}