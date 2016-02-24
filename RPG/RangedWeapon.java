import java.util.ArrayList;
/**
 * Write a description of class Ranged here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class RangedWeapon extends Weapon{
    private ArrayList stats;
    public RangedWeapon(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
        super(ammo,damage,criticalChance,highDamage,lowDamage);
    }
    public RangedWeapon(){
        this(15,25,.5,45,0);
    }
    public RangedWeapon (String Name){
        super(Name);
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
