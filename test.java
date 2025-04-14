import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]cenz = {"арбузов","арбузы"};
        String one_cenz = "арбуз";
        String text = scanner.nextLine();
        text = text.toLowerCase();
        for(int i=0;i<cenz.length;i++){
            if(text.contains(cenz[i])){
                text=text.replace(cenz[i],"яблоко");
            }
        }
        if(text.contains(one_cenz)){
            text=text.replace(one_cenz,"яблоко");
        }
        System.out.println(text);
    }
}
