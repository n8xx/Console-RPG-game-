import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static String key;
    private static boolean isEnd = false;
    static Scanner scanner = new Scanner(System.in);
    private static Unit player;
    private static Unit enemy = new Unit("Wolf");
    public static Unit boss = new Unit("Tiger");




    public static void ShowStartMenu() {
        //1 этап
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcom to my RPG Game ^_^");
        System.out.println("Enter you player number: ");
        System.out.println("_______________________");
        String unitName = scanner.nextLine();
        player = new Unit(unitName);
        System.out.println("Okay, I call you: " + unitName);
        System.out.println("_______________________");
        //System.out.println("Let's go to play! Just type space button...");
        //key = scanner.next();

        //3 этап
        do {
            switch (ShowMainMenu()) {
                case 1:
                    Unit.ShowStats(player);
                    break;
                case 2:
                    Random random = new Random();
                    int enemyRandom = random.nextInt(1,10);
                    if(enemyRandom>5) enemy=boss;
                    Battle.RandomBattleFight(player,enemy);
                    break;
                case 3:
                    System.out.println("Select a/d: ");

                    while (true) {
                        String selectButton = scanner.next();
                        Shop.ShowItems(selectButton);
                        if(selectButton.equals("b")) Shop.BuyItems(player);
                        if(selectButton.equals("q")) break;
                    }
                    break;
                case 4:
                    Unit.ShowInventory(player);
                    break;
                case 5:
                    isEnd=true;
                    break;
            }
        } while (!isEnd);

    }

    public static int ShowMainMenu() {
        //2 этап
        int isChoised;
        System.out.println("Choose your options: ");
        System.out.println("1. Show stats");
        System.out.println("2. Fight arena");
        System.out.println("3. Shop");
        System.out.println("4. Inventory");
        System.out.println("5. Exit");
        isChoised = scanner.nextInt();
        return isChoised;
    }
}
