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
        ArrayList<Character> characters = new ArrayList<>();
        Player player1 = new Player("Alice", 100, 5, "Fireball");
        Monster monster1 = new Monster("Goblin", 50, "Beast", 15);

        characters.add(player1);
        characters.add(monster1);

        showCharacterInfo(characters);

        System.out.println("\nCombat Demonstration:");
        player1.attack(monster1); // Player attacks Monster
        monster1.attack(player1); // Monster attacks Player

        System.out.println("\nAfter Combat:");
        showCharacterInfo(characters);
    }

    public static void showCharacterInfo(ArrayList<Character> characters) {
        System.out.println("Character Information:");
        for (Character character : characters) {
            character.display();
        }
    }
}