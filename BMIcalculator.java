import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("신장(cm): ");

        double h = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double w = scanner.nextDouble();

        double result = w / ((h * h) / 10000);

        //BMI 식  = weight/ (height)*h /10000

        if (result <= 18.5) {
            System.out.println("비만도 결과: 저체중");
            System.out.println("BMI: " + result);
        }
        if (result > 18.5 & result <= 23) {
            System.out.println("비만도 결과: 정상");
            System.out.println("BMI: " + result);
        }
        if (23 < result & result <= 25) {
            System.out.println("비만도 결과: 과체중");
            System.out.println("BMI: " + result);
        }
        if (result > 25) {
            System.out.println("비만도 결과: 비만");
            System.out.println("BMI: " + result);
        }


    }
}
