import java.util.ArrayList;
/**
 * Write a description of class Weapon here.
 * 
 * @author Jarom Kraus 
 * @version 2.18.16
 */

@SuppressWarnings("unchecked")
public abstract class Weapon extends Item implements WeaponInterface{
    private int ammo;
    private int damage;
    private double critChance;
    private int hDamage;
    private int lDamage;
    private ArrayList stats;
    public Weapon(int ammo, int damage, double criticalChance, int highDamage, int lowDamage){
        stats = new ArrayList();
        
        
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
    public ArrayList getStats(){
        stats = new ArrayList();
        stats.add(ammo);
        stats.add(damage);
        stats.add(critChance);
        stats.add(hDamage);
        stats.add(lDamage);
        return stats;
    }
    public boolean parry(){
        return true;
    }
    public int attack(int attack){
        attack = 10;
        System.out.println("These weapons have some sort of attack");
        return attack;
    }
}
