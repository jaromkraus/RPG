import java.util.ArrayList;
/**
 * Write a description of class AssultRifle here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class AssaultRifle extends RangedWeapon{
    private ArrayList stats;
    public AssaultRifle(String Name){
        super(Name);
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
