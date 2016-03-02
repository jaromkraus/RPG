import java.util.ArrayList;
/**
 * Write a description of class BerserkerPotion here.
 * 
 * @author Jarom Kraus 
 * @version 3.2.16
 */
@SuppressWarnings("unchecked")
public class BerserkerPotion extends Potion{
   private ArrayList stats;
   public BerserkerPotion(String Name){
       super(Name);
   }
   public void drinkBerserkerPotion(){
       System.out.println("You drink the berserker potion and it increases everything by 100%");
   }
   public ArrayList getStats(){
       stats = new ArrayList();
       stats.addAll(super.getStats());
       return stats;
   }
}
