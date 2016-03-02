import java.util.ArrayList;
/**
 * Write a description of class LightningCannon here.
 * 
 * @author Jarom Kraus 
 * @version 3.2.16
 */
@SuppressWarnings("unchecked")
public class LightningCannon extends IonCannon{
    private ArrayList stats;
    public LightningCannon(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
        super(ammo,damage,criticalChance,highDamage,lowDamage);
    }
    public LightningCannon(int stats){
        this(1,2000000,.9,6000000,5);
    }
    public LightningCannon(String Name){
        super(Name);
    }
    public LightningCannon(){
        System.out.println("You destroy the world once then rebuilds it, then destroys it all over again. Ps Ion Cannon protection will only protect you from this attack for one of the times");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
