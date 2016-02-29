import java.util.ArrayList;
/**
 * Write a description of class EnergySword here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class EnergySword extends Melee{
    private ArrayList stats;
   public EnergySword(String Name){
       super(Name);
    }
   public boolean parry(){
        return false;
   }
   public void EnergySwordAttack(){
       int attack = 1987;
       System.out.println("This attack is enough to burn the very life force out of anything that it touches");
   }
   public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
