import java.util.Scanner;

public class KcalConsumption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("운동 종류: ");

        String type = scanner.next();


        if (!type.equals("자전거") & !type.equals("걷기") & !type.equals("달리기")) {
            System.exit(1);
        }

        System.out.print("체중(kg): ");
        double w = scanner.nextDouble();
        System.out.print("운동 시간(분): ");
        double t = scanner.nextDouble();

        double kcalamount = 0;

        // 운동시간 * (2.3*1/15) * 체중
        if (type.equals("자전거")) {
            kcalamount = ((2.3/15))*w*t;
        }
        if (type.equals("걷기")) {
            kcalamount = ((0.9/15)*w*t);
        }
        if (type.equals("달리기")) {
            kcalamount = ((2.0/15)*w*t);
        }
        System.out.println("칼로리 소모: " + kcalamount + "kcal");
    }
}
