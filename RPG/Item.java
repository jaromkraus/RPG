
/**
 * Write a description of class Item here.
 * 
 * @author Jarom Kraus
 * @version 2.17.16
 */
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public abstract class Item implements ItemInterface{
    private int numberOfItems;
    private int powerOfItems;
    private int durability;
    private ArrayList stats;
    public void Items(int durable, int numOfItems, int powOfItems){
        stats = new ArrayList();
        
        numOfItems = numberOfItems;
        powOfItems = powerOfItems;
        durable = durability;
        
        stats.add(numOfItems);
        stats.add(powOfItems);
        stats.add(durable);
    }
    public void useItem(){
        System.out.println("You use the item and it affects your stats.");
    }
    public ArrayList getStats(){
        return stats;
    }
}
