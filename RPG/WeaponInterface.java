
/**
 * Write a description of interface WeaponInterface here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
public interface WeaponInterface{
    /**
     * Attacks an enemy for an amount
     * 
     * @param  amount Amount of damage to the opponent
     * @return        Returns amount of damage successfully done to the opponent 
     */
    int attack();
    /**
     * Parry Attack Method
     * 
     * @return        True if the attack was parried. 
     */
    boolean parry();
    
}
