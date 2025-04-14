public class Items {
    protected String item_name;
    protected int dmg;
    protected int rst;
    protected int cost;
    protected int hp;
    public void ShowItem(){

    }

    public String getItemName(){
        return item_name;
    }
    public void setItemName(String item_name){
        this.item_name=item_name;
    }
    public int getDamage(){
        return dmg;
    }
    public void setDamage(int dmg){
        this.dmg=dmg;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public int getResistance(){
        return rst;
    }
    public void setResistance(int rst) {
        this.rst = rst;
    }
    public int getHP(){
        return hp;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }

    public static class Weapon extends Items
    {
        public Weapon(String tag, int damage, int gold){
            item_name = tag;
            dmg = damage;
            cost = gold;
        }
        @Override
        public void ShowItem(){
            System.out.println("Name: "+this.item_name);
            System.out.println("Damage: "+this.dmg);
            System.out.println("Cost: "+this.cost);
        }
    }

    public static class Armor extends Items
    {
        public Armor(String tag, int arm, int gold) {
            item_name = tag;
            rst = arm;
            cost = gold;
        }
        @Override
        public void ShowItem(){
            System.out.println("Name: "+this.item_name);
            System.out.println("Resistance: "+ this.rst);
            System.out.println("Cost: "+this.cost);
        }
    }

    public static class Aid extends Items
    {
        public Aid(String tag, int hits,int gold) {
            item_name = tag;
            hp = hits;
            cost = gold;
        }
        @Override
        public void ShowItem(){
            System.out.println("Name: "+this.item_name);
            System.out.println("Hit points: "+ this.hp);
            System.out.println("Cost: "+this.cost);
        }
    }


}
