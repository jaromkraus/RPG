import java.util.ArrayList;
/**
 * Write a description of class IonCannon here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class IonCannon extends RangedWeapon{
   private ArrayList stats;
   public IonCannon(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
       super(ammo,damage,criticalChance,highDamage,lowDamage);
   }
   public IonCannon(int Stats){
       this(1,1000000,.9,5000000,10);
    }
   public IonCannon(String Name){
       super(Name);
   }
    public IonCannon(){
    System.out.println("You just destroyed the world. Congradulations.  Game over.");
   }
   public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
