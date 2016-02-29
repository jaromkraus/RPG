import java.util.ArrayList;
/**
 * Write a description of class LongSword here.
 * 
 * @author Jarom Kraus
 * @version 2.23.16
 */
@SuppressWarnings("unchecked")
public class LongSword extends Melee{
    private ArrayList stats;
    public LongSword(String Name){
        super(Name);
    }
    public LongSword(){
        System.out.println("You walk up with the long sword over your shoulder and stare into the person's eyes as you swing the sword and cleave their head off");
    }
    public boolean parry(){
        return false;
    }
    public void LongSwordAttack(){
        int attack = 100;
        System.out.println("This attack is enough to cleave the head off of any enemy");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
