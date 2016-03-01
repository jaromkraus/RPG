import java.util.ArrayList;
/**
 * Write a description of class FencingSword here.
 * 
 * @author Jarom Kraus 
 * @version 3.1.16
 */
@SuppressWarnings("unchecked")
public class FencingSword extends Melee{
   private ArrayList stats;
   public FencingSword(String Name){
       super(Name);
    }
   public FencingSword(){
        System.out.println("You slide the sword out of it's sheath and yell at the enemy and start and sword battle with the enemy until it ends with you standing over the headless body of your enemy");
   }
   public boolean parry(){
       return false;
    }
   public void FencingSwordAttack(int attack){
       attack = 30;
    }
   public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
   }
}
