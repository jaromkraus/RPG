import java.util.ArrayList;
/**
 * Write a description of class StrengthPotion here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class StrengthPotion extends Potion{
    private ArrayList stats;
    public StrengthPotion(String Name){
        super(Name);
    }
    public void drinkStrengthPotion(){
        System.out.println("You drink the strength potion and your strength is increased.");
    }public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
