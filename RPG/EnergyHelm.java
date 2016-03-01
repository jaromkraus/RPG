import java.util.ArrayList;
/**
 * Write a description of class EnergyHelm here.
 * 
 * @author Jarom Kraus 
 * @version 3.1.16
 */
@SuppressWarnings("unchecked")
public class EnergyHelm extends Armor{
    private ArrayList stats;
    public EnergyHelm(String Name){
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
