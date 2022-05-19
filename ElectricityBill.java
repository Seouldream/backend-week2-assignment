import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kwh): ");

        int amount = scanner.nextInt();

        double cost = 0;


        if (amount <= 300) {
            System.out.println("사용 금액: " + (int) (88.3 * amount));
        }
        if (amount > 300 & amount <= 450) {
            System.out.println("사용 금액: " + (int) ((88.3 * 300) + (182.9 * (amount - 300))));
        }
        if (amount > 450 & amount <= 1000) {
            System.out.println("사용 금액: " + (int) ((88.3 * 300) + (182.9 * 150) + 275.6 * (amount - 450)));
        }
        if (amount > 1000) {
            System.out.println("사용 금액: " + (int) ((88.3 * 300) + (182.9 * 150) + (275.6 * 550) + 704.5 * (amount - 1000)));
        }
    }
}