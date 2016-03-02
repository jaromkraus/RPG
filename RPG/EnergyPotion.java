import java.util.ArrayList;
/**
 * Write a description of class EnergyPotion here.
 * 
 * @author Jarom Kraus 
 * @version 3.2.16
 */
@SuppressWarnings("unchecked")
public class EnergyPotion extends Potion{
    private ArrayList stats;
    public EnergyPotion(String Name){
        super(Name);
    }
    public void drinkEnergyPotion(){
        System.out.println("You drink the energy potion and it increases your energy");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
