import java.util.ArrayList;

public class Unit {
    private int hp = 20;
    private int gold = 200;
    private int energy = 100;
    private int damage = 30;
    private int physic_resist = 2;
    private String name;
    public Items[] inventory = new Items[100];
    //ArrayList<Items> inventory = new ArrayList<>();

    public Unit(String nickname){
        this.name = nickname;
    }
    public Unit(String nickname, int hp, int damage){
        this.name = nickname;
        this.hp=hp;
        this.damage=damage;
    }
    public static void ShowStats(Unit player){
        System.out.println("Name: "+ player.getName());
        System.out.println("HP: "+ player.getHp());
        System.out.println("Attack: "+ player.getDamage());
        System.out.println("Resistance: "+player.getPhisicResist());

        for(Items item: player.inventory){
            if(item!=null){
                System.out.println(item.item_name);
            }
            break;
        }
    }
    public static void ShowInventory(Unit player){
        for(Items item: player.inventory){
            if(item!=null){
                System.out.println(item.item_name);
            }
        }
    }

    public int getHp(){
        return hp;
    }
    public int getGold(){
        return gold;
    }
    public int getEnegry(){
        return energy;
    }
    public int getDamage(){
        return damage;
    }
    public int getPhisicResist(){
        return physic_resist;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setGold(int gold){
        this.gold = gold;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public void setPhisicsResist(int physic_resist){
        this.physic_resist=physic_resist;
    }
    public int SetDamage(){
        return damage;
    }
    public void GetDamage(int damageValue){
        hp = hp + physic_resist - damageValue;
    }
    public String getName(){
        return name;
    }
}
