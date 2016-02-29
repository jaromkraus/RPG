import java.util.ArrayList;
/**
 * Write a description of class Shield here.
 * 
 * @author Jarom Kraus 
 * @version 2.18.16
 */
@SuppressWarnings("unchecked")
public class Shield extends Armor{
    private ArrayList stats;
    public Shield (String Name){
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
