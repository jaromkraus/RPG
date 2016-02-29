import java.util.ArrayList;
/**
 * Write a description of class Gauntlet here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class Gauntlet extends Armor{
    private ArrayList stats;
    public Gauntlet (String Name){
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
