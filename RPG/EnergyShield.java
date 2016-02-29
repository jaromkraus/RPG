import java.util.ArrayList;
/**
 * Write a description of class EnergyShield here.
 * 
 * @author Jarom Kraus
 * @version 2.29.16
 */
@SuppressWarnings("unchecked")
public class EnergyShield extends Armor{
    private ArrayList stats;
    public EnergyShield (String Name){
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
}
