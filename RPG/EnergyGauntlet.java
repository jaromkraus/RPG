import java.util.ArrayList;
/**
 * Write a description of class EnergyGauntlet here.
 * 
 * @author Jarom Kraus 
 * @version 3.2.16
 */
@SuppressWarnings("unchecked")
public class EnergyGauntlet extends Armor{
    private ArrayList stats;
    public EnergyGauntlet(String Name){
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
