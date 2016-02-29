import java.util.ArrayList;
/**
 * Write a description of class WoodStaff here.
 * 
 * @author Jarom Kraus 
 * @version (2.23.16
 */
@SuppressWarnings("unchecked")
public class WoodStaff extends RangedWeapon {
   private ArrayList stats;
   public WoodStaff(String Name){
       super(Name);
   }
   public WoodStaff(){
       System.out.println("You start to spin the staff and as you spin, fireballs and lightning strikes fly off in all directions, increasing the faster the staff spins.");
   }
   public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
