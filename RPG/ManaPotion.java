import java.util.ArrayList;
/**
 * Write a description of class ManaPotion here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class ManaPotion extends Potion{
    private ArrayList stats;
    public ManaPotion(String Name){
        super(Name);
    }
    public void drinkManaPotion(){
        System.out.println("You drink the mana potion and it increases your mana.");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
