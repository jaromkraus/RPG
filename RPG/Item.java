
/**
 * Write a description of class Item here.
 * 
 * @author Jarom Kraus
 * @version 2.17.16
 */// 
public abstract class Item implements ItemInterface{
    private int numberOfItems;
    private int powerOfItems;
    private int durability;
    public void Items(int durable, int numOfItems, int powOfItems){
        numOfItems = numberOfItems;
        powOfItems = powerOfItems;
        durable = durability;
    }
    public void useItem(){
        System.out.println("You use the item and it affects your stats.");
    }
    
}
