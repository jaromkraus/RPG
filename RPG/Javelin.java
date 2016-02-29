import java.util.ArrayList;
/**
 * Write a description of class Javelin here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class Javelin extends RangedWeapon{
    private ArrayList stats;
    public Javelin(String Name){
        super(Name);
    }
    public boolean parry(){
        return true;
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
