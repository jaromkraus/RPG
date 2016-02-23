
/**
 * Write a description of class Ranged here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
public class RangedWeapon extends Weapon{
    public RangedWeapon(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
        super(ammo,damage,criticalChance,highDamage,lowDamage);
    }
    public RangedWeapon(){
        this(15,25,.5,45,0);
    }
    public RangedWeapon (String Name){
        super(Name);
    }
    
}
