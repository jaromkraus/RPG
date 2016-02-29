import java.util.ArrayList;
/**
 * Write a description of class Armor here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public abstract  class Armor extends Item implements DefenseCommands {
   private int weight;
   private int strength;
   private ArrayList stats;
   public Armor(int weight, int strength){
       stats = new ArrayList();
       
       weight = weight;
       strength = strength;
       
       stats.add(weight);
       stats.add(strength);
    }
   public Armor(){
        this(10,50);
   }
    public boolean blocked(){
        return true;
   }
   String name;
    public Armor (String Name){
    name = Name;
   }
    public String getName(){
    return name;
   }
   public ArrayList getStats(){
       return stats;
    }
}
    
   

