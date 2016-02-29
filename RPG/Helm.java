import java.util.ArrayList;
/**
 * Write a description of class Helm here.
 * 
 * @author Jarom Kraus 
 * @version 2.29.16
 */
@SuppressWarnings("unchecked")
public class Helm extends Armor{
    private ArrayList stats;
    public Helm (String Name){
        super (Name);
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
