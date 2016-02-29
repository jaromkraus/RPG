import java.util.ArrayList;
/**
 * Write a description of class HealthPotion here.
 * 
 * @author Jarom Kraus
 * @version 2.18.16
 */
@SuppressWarnings("unchecked")
public class HealthPotion extends Potion{
    private ArrayList stats;
    public HealthPotion(String Name){
        super(Name);
    }
    public void drinkHealthPotion(){
        System.out.println("You drink the health potion and it increases your heath.");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
