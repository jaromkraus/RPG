
/**
 * Write a description of class Armor here.
 * 
 * @author Jarom Kraus 
 * @version 2.22.16
 */
public abstract  class Armor extends Item implements DefenseCommands{
    boolean blocked(){
        System.out.println("This changed");
        return true;
  }
String name;
public Armor (String Name){
    name = Name;
  }
public String getName(){
    return name;
  }
//    
}
