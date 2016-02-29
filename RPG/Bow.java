import java.util.ArrayList;
/**
 * Write a description of class Bow here.
 * 
 * @author Jarom Kraus 
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class Bow extends RangedWeapon{
    private ArrayList stats;
    public Bow(String Name){
        super(Name);
    }
    public Bow(){
        System.out.println("You lift the bow, knock an arrow, take aim, and let the arrow fly to where it impails itself in the enemy's eye");
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
