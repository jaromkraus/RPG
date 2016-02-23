
/**
 * Write a description of class Backpack here.
 * 
 * @author Jarom Kraus
 * @version 2.18.16
 */
import java.util.ArrayList;
public class Backpack implements BackpackInterface{
    private ArrayList<Item> backpack;
    public boolean storeItem(Item item){
        backpack.add(item);
        return true;
    }
    public Backpack(){
        backpack = new ArrayList<Item>();
    }
    public boolean useItem(Item item){
        for (int i=0; i<backpack.size(); i++){
            if(backpack.get(i)==item){
                backpack.remove(i);
                return true;
            }
        }
        return false;
    }
}
