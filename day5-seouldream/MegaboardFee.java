import java.util.Scanner;

public class MegaboardFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간(분): ");
        int ServiceTime = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        String ox = scanner.next();

        int result = 0;

        if (ox.equals("o")) {
            result = (1000 + 150 * ServiceTime) * 9 / 10;
        }

        if (ox.equals("x")) {
            result = 1000 + 150 * ServiceTime + 3000;
        }

        System.out.println("요금:" + result + " 원");
    }
}
