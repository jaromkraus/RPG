
/**
 * Write a description of class Melee here.
 * 
 * @author Jarom Kraus 
 * @version 2.18.16
 */
public class Melee extends Weapon {
  public Melee(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
    super(ammo,damage,criticalChance,highDamage,lowDamage);
  }
  public Melee(){
      this(0,20,.25,40,5);
  }
  public Melee (String Name){
      super(Name);
  }
}
