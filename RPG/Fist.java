import java.util.ArrayList;
/**
 * Write a description of class Fist here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class Fist extends Melee{
   private ArrayList stats;
   public Fist(String Name){
       super(Name);
   }
   public boolean parry(){
       return false;
    }
   public void FistAttack(){
       int attack = 5;
       System.out.println("When the attack hit, it barely does enough damage to stun the enemy");
    }
   public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
   }
}
