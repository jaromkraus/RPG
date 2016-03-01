import java.util.ArrayList;
/**
 * Write a description of class FireExtingisher here.
 * 
 * @author Jarom Kraus
 * @version 3.1.16
 */
@SuppressWarnings("unchecked")
public class FireExtingisher extends Melee {
    private ArrayList stats;
    public FireExtingisher(String Name){
        super(Name);
    }
    public FireExtingisher(){
        System.out.println("You grab the fire extingisher off of the wall and start using it to bash in the head of your enemy.");
    }
    public boolean parry(){
        return false;
    }
    public void FireExtingisherAttack(int attack){
        attack = 15;
        System.out.println("This has enough attack to stun your enemy if only one hit is made");
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
