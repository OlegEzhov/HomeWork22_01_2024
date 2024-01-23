import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше предложение: ");
        String box1 = scanner.nextLine();
        String box2 = box1.replaceFirst(box1, "Пицца");
        int box3 = box1.indexOf(',');
        System.out.print(box2);
        System.out.print(box1.substring(box3));
        System.out.println();
        System.out.println("................");

        System.out.println("Ваше 2 предложение: ");
        String box4 = scanner.nextLine();
        String box5 = box4.replace(box4, "Пицца");
        int box6 = box4.indexOf(',');
        System.out.print(box5);
        System.out.print(box4.substring(box6));

    }
}