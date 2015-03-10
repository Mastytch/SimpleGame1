package MyTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Enemy e1 = new Enemy();
        Player p1 = new Player();
        Fight f1 = new Fight();

        System.out.println("Вы входите в комнату, полный оптимизма и готовый ко всему!");
        System.out.println(e1.enemyFill());
        System.out.println("У Вас есть 3 предмета: (1) ножницы, (2) палка и (3) кусок колбасы. \n" +
                "Сделайте выбор для чего то там...\n");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        p1.setChoice(choice);
        System.out.println();

        System.out.println(f1.Fight(p1.getChoice()));

    }
}