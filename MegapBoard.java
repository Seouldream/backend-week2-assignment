import java.util.Scanner;

public class MegapBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이용시간(분): ");

        int minute = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");

        String YesorNo = scanner.next();

        double fee1 = (1000+(150*minute))*(9.0/10);
        double fee2 = 1000+(150*minute)+3000;

        if(YesorNo.equals("o")) {
            System.out.println("요금:" + (int)fee1 + " 원");
        }
        if(YesorNo.equals("x")) {
            System.out.println("요금: " + (int)fee2 + " 원");
        }
    }
}
