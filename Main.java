import java.util.ArrayList;

/**
 * Main class to explore inheritance with abstract classes, polymorphism and interfaces 
 * Demonstrates polymorphism with a list of Character objects.
 * 
 * @author ITSC 1213
 * @version Mar 23, 2025
 */
public class Main {
    public static void main(String[] args) {
        // Create example objects
        Player player1 = new Player("Alice", 100, 5, "Fireball");
        Monster monster1 = new Monster("Goblin", 50, "Beast", 15);
        Cleric cleric1 = new Cleric("Eli", 80, 20, 10);

        // Target character
        Character target = new Monster("Orc", 60, "Warrior", 20);

        // Test simulateAttack
        System.out.println("\nTesting simulate - Attack:");
        simulateAttack(player1, target); // Player attacks target
        simulateAttack(monster1, target); // Monster attacks target

        // Test simulateHeal
        System.out.println("\nTesting simulate - Heal:");
        simulateHeal(cleric1, target); // Cleric heals target

        // Display final state of the target
        System.out.println("\nFinal State of Target:");
        target.display();
    }

    /**
     * Simulates an attack action.
     * 
     * @param attacker The object performing the attack.
     * @param target The target of the attack.
     */
    public static void simulateAttack(Attacker attacker, Character target) {
        System.out.println("Simulating attack...");
        attacker.attack(target);
    }

    /**
     * Simulates a heal action.
     * 
     * @param healer The object performing the heal.
     * @param target The target of the heal.
     */
    public static void simulateHeal(Healer healer, Character target) {
        System.out.println("Simulating heal...");
        healer.heal(target);
    }

    /**
     * Displays information about each character in the list.
     * Demonstrates polymorphism by calling the display() method on Character references.
     * 
     * @param characters List of Character objects
     */
    public static void showCharacterInfo(ArrayList<Character> characters) {
        System.out.println("Character Information:");
        for (Character character : characters) {
            character.display();
        }
    }
}