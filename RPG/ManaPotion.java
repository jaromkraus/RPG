
/**
 * Write a description of class ManaPotion here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
@SuppressWarnings("unchecked")
public class ManaPotion extends Potion{
    public ManaPotion(String Name){
        super(Name);
    }
    public void drinkManaPotion(){
        System.out.println("You drink the mana potion and it increases your mana.");
    }
    
}
