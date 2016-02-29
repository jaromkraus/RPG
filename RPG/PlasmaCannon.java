import java.util.ArrayList;
/**
 * Write a description of class PlasmaCannon here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class PlasmaCannon extends RangedWeapon{
    private ArrayList stats;
    public PlasmaCannon(String Name){
        super(Name);
    }
    public PlasmaCannon(){
        System.out.println("You take the rifle, turn it on, take aim, and charge the rifle till it's shaking in your hands and you let the trigger go, unleashing a firey ball of white hot lightning at the enemy.");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
