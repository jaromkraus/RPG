
/**
 * Write a description of class HealthPotion here.
 * 
 * @author Jarom Kraus
 * @version 2.18.16
 */
public class HealthPotion extends Potion{
    public HealthPotion(String Name){
        super(Name);
    }
    public void drinkHealthPotion(){
        System.out.println("You drink the health potion and it increases your heath.");
    }
}
