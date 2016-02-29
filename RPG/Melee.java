import java.util.ArrayList;
/**
 * Write a description of class Melee here.
 * 
 * @author Jarom Kraus 
 * @version 2.18.16
 */

@SuppressWarnings("unchecked")
public class Melee extends Weapon {
  private ArrayList stats;
  public Melee(int ammo,int damage, double criticalChance, int highDamage, int lowDamage){
    super(ammo,damage,criticalChance,highDamage,lowDamage);
  }
  public Melee(){
      this(0,20,.25,40,5);
  }
  public Melee (String Name){
      super(Name);
  }
  public ArrayList getStats(){
      stats = new ArrayList();
      stats.addAll(super.getStats());
      return stats;
  }
  public boolean parry(){
      return true;
  }
  public int attack(){
      super.attack(10);
      return 10;
  }
}
