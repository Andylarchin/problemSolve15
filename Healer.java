/**
 * Interface representing the ability to heal another character.
 * 
 * @author ITSC 1213
 * @version Mar 23, 2025
 */
public interface Healer {
    /**
     * Performs a healing action on the specified character.
     * 
     * @param target The character being healed.
     */
    void heal(Character target);
}