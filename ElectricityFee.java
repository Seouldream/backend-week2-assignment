import java.util.Scanner;

public class ElectricityFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("전기 사용량(kwh): ");

        int Electricity_use = scanner.nextInt();

        double fee1 = Electricity_use * 88.3;
        double fee2 = 300 * 88.3 + (Electricity_use - 300) * 182.9;
        double fee3 = 300 * 88.3 + 150 * 182.9 + (Electricity_use - 450) * 275.6;
        double fee4 = 300 * 88.3 + 150 * 182.9 + 550 * 275.6 + (Electricity_use - 1000) * 704.5;

        if (Electricity_use <= 300) {
            System.out.println("사용 금액: "+ (int)fee1 );
        }
        if (Electricity_use > 300 & Electricity_use <= 450) {
            System.out.println("사용 금액: "+ (int)fee2 );
        }
        if (Electricity_use > 450 & Electricity_use <= 1000) {
            System.out.println("사용 금액: "+ (int)fee3 );
        }
        if (Electricity_use > 1000) {
            System.out.println("사용 금액: "+ (int)fee4 );
        }
    }
}
