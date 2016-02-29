import java.util.ArrayList;
/**
 * Write a description of class SpeedPotion here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class SpeedPotion extends Potion{
    private ArrayList stats;
    public SpeedPotion(String Name){
        super(Name);
    }
    public void DrinkSpeedPotion(){
        System.out.println("you drink the speed potion and it increases your speed.");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
