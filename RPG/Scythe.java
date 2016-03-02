import java.util.ArrayList;
/**
 * Write a description of class Scythe here.
 * 
 * @author Jarom Kraus 
 * @version (3.2.16
 */
@SuppressWarnings("unchecked")
public class Scythe extends Melee{
    private ArrayList stats;
    public Scythe(String Name){
        super(Name);
    }
    public boolean parry(){
        return false;
    }
    public void ScytheAttack(){
        int attack = 1700;
        System.out.println("This attack is enough to cleave the soul out of whatever enemy it touchesd");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
