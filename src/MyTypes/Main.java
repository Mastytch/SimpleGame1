package MyTypes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Enemy e1 = new Enemy();
        Player p1 = new Player();
        Fight f1 = new Fight();

        System.out.println("Вы входите в комнату, полный оптимизма и готовый ко всему!");
        System.out.println("---------");
        System.out.println(e1.enemyFill());
        System.out.println("---------");
        System.out.println("У Вас есть 3 предмета: (1) ножницы, (2) палка и (3) кусок колбасы.");
        System.out.println("---------");
        System.out.println("Введите 1, 2 или 3 для взаимодействия....");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(String.valueOf(sc.nextInt()));
        p1.setChoice(choice);
        //System.out.println(p1.getChoice()); // Дэбаг
        //System.out.println(e1.getEnemyChoice());

        System.out.println(f1.Fight(e1.getEnemyChoice(), p1.getChoice()));

    }
}