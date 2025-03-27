/**
 * Interface representing the ability to attack another character.
 * 
 * @author ITSC 1213
 * @version Mar 23, 2025
 */
public interface Attacker {
    /**
     * Performs an attack on the specified character.
     * 
     * @param target The character being attacked.
     */
    void attack(Character target);
}
