
/**
 * Write a description of class Potion here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
public abstract class Potion extends Consumable{
    String name;
    public Potion (String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
}
