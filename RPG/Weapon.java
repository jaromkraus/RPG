
/**
 * Write a description of class Weapon here.
 * 
 * @author Jarom Kraus 
 * @version 2.18.16
 */
public abstract class Weapon extends Item implements WeaponInterface{
    private int ammo;
    private int damage;
    private double critChance;
    private int hDamage;
    private int lDamage;
    public Weapon(int ammo, int damage, double criticalChance, int highDamage, int lowDamage){
        ammo = ammo;
        damage = damage;
        critChance = criticalChance;
        highDamage = hDamage;
        lowDamage = lDamage;
        
    }
    public Weapon(){
        this(25,20,.5,50,2);
    }
    String name;
    public Weapon (String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
}
