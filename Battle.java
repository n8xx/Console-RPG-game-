import java.util.Random;
import java.util.Scanner;

public class Battle {
    private static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    private Battle(){

    }

    public static void RandomBattleFight(Unit player, Unit enemy){
        while (player.getHp()>0 && enemy.getHp()>0){
            int counterFights = 0;
            System.out.println("Fighter 1");
            System.out.println("Name: "+ player.getName());
            System.out.println("HP: "+ player.getHp());
            System.out.println("Attack: "+ player.getDamage());
            System.out.println("________________________________");
            System.out.println("Fighter 2");
            System.out.println("Name: "+ enemy.getName());
            System.out.println("HP: "+ enemy.getHp());
            System.out.println("Attack: "+ enemy.getDamage());
            int randomNumber = random.nextInt(1,6);
            for (int i=0;i<3;i++){
                System.out.println("Введите число от 1 до 6: ");
                int playerNumber = scanner.nextInt();
                int enemyNumber = random.nextInt(1,6);
                if(randomNumber==playerNumber){
                    counterFights++;
                    randomNumber = random.nextInt(1,6);
                    System.out.println("You guesses a number in: "+ counterFights+" times");
                    System.out.println("You have dealt damage: "+counterFights*player.SetDamage());
                    enemy.GetDamage(counterFights*player.SetDamage());
                    System.out.println("HP enemy: "+enemy.getHp());
                    break;
                }
                if(randomNumber==enemyNumber){
                    randomNumber = random.nextInt(1,6);
                    System.out.println("Enemy guesses a number");
                    System.out.println(("Random number was: " + randomNumber));
                    player.GetDamage(enemy.SetDamage());
                    break;
                }
                System.out.println("Nobody guessed. Try again");
            }
            System.out.println("Continue? [y/n])");
            String ins = scanner.next();
            if(ins.equals("n")){
                break;
            }
        }
        if(player.getHp()>enemy.getHp()) {
            player.setGold(random.nextInt(30, 100));
            System.out.println(player.getName() + " победил!");
            System.out.println("You gold: " + player.getGold());
        }
        else if (player.getHp()<enemy.getHp()){
            System.out.println("Enemy Win! You Loser!");
        }
        else if (player.getHp()==enemy.getHp()){
            System.out.println("Nobody Win!");
        }

        }
    }

