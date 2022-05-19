import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1 + " + " + n2 + " = ?");

        int answer1 = scanner.nextInt();

        System.out.println(n1 + " * " + n2 + " = ?");

        int answer2 = scanner.nextInt();

        boolean result1 = n1 + n2 == answer1;
        boolean result2 = n1*n2 == answer2;

        if(result1 & result2) {
            System.out.println("Genius!");
        }
        if((!result1 & result2) |(result1 & !result2)) {
            System.out.println("Muggle!");
        }
        if(!result1 & !result2) {
            System.out.println("Stupid!");
        }
    }
}
