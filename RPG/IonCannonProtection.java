import java.util.ArrayList;
/**
 * Write a description of class IonCannonProtection here.
 * 
 * @author Jarom Kraus 
 * @version 3.2.16
 */
@SuppressWarnings("unchecked")
public class IonCannonProtection extends Armor{
    private ArrayList stats;
    public IonCannonProtection(String Name){
        super(Name);
    }
    public boolean blocked(){
        return true;
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
    public IonCannonProtection(){
        System.out.println("This piece of armor will protect you once you activate the ion cannon and after the world is completely destroyed, you become god. the end.");
    }
}
