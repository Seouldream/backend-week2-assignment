import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");

        String Name = scanner.next();

        System.out.println("Hello, " + Name + "!");

    }
}
