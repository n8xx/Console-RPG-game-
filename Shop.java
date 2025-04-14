import java.util.List;
import java.util.Scanner;

public class Shop {
    private static Items.Weapon LightSword = new Items.Weapon("Light Sword", 3,30);
    private static Items.Armor LightArmor = new Items.Armor("Light Armor", 1, 15);
    private static Items.Aid SmallAid = new Items.Aid("Small Aid", 10,10);
    private static Items[]  ListItems = {LightSword,LightArmor,SmallAid};
    private static int selector = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void ShowItems(String selectButton) {
        System.out.println("selector: " + selector);
        System.out.println("\nPress a/d to select items, b - buy item, q-quit: ");
        if (selectButton.equals("d")) {
            if (selector >= ListItems.length - 1) {
                selector = selector - (ListItems.length - 1);
            } else {
                selector++;
            }
        }
        if (selectButton.equals("a")) {
            //selector -= selector < 1 ? -ListItems.length + 1 : 1;
            if(selector < 1) {
                selector = selector + (ListItems.length - 1);
            } else {
                selector--;
            }
        }
        ListItems[selector].ShowItem();
    }


    public static void BuyItems(Unit unit){
        if(unit.getGold()>=ListItems[selector].getCost()){
            unit.setGold(unit.getGold()-ListItems[selector].getCost());
            unit.setPhisicsResist(unit.getPhisicResist()+ListItems[selector].getResistance());
            unit.setDamage(unit.getDamage()+ListItems[selector].getDamage());
            unit.setHp(unit.getHp()+ListItems[selector].getHP());
            for(int i=0;i<unit.inventory.length;i++){
                if(unit.inventory[i]==null){
                    unit.inventory[i]=ListItems[selector];
                    System.out.println("Вы добавили: "+ ListItems[selector].getItemName());
                    break;
                }
            }
            System.out.println("Success!!!");
        } else {
            System.out.println("You don't have enough money :(");
        }
    }
}
