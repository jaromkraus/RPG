import java.util.ArrayList;
/**
 * Write a description of class AssasinBlades here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class AssasinBlades extends Melee{
    private ArrayList stats;
    public AssasinBlades (String Name){
        super(Name);
    }
    public AssasinBlades(){
        System.out.println("You sneak up behind a player and slit their throat without a sound.");
    }
    public boolean parry(){
        return false;
    }
    public void AssassinAttack(int attack){
        attack = 100;
        System.out.println("This weapon has enough attack to kill anyone if you surprise them" + attack);
    }
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.addAll(super.getStats());
        return stats;
    }
}
