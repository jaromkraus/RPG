
/**
 * Write a description of class IonCannon here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
public class IonCannon extends RangedWeapon{
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
    System.out.println("You just destroyed the world.Congradulations.  Game over.");
   }
}
