import java.util.ArrayList;
/**
 * Write a description of class Consumable here.
 * 
 * @author Jarom Kraus 
 * @version 2.24.16
 */
@SuppressWarnings("unchecked")
public abstract class Consumable extends Item{
    private int amount;
    private int weight;
    private ArrayList stats;
    public void Consumable(int amount, int weight){
        stats = new ArrayList();
        
        amount = amount;
        weight = weight;
        
        stats.add(weight);
        stats.add(amount);
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.add(amount);
        stats.add(weight);
        return stats;
    }
}
