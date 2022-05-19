import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //신장 체중 출력 및 입력 받음
        System.out.print("신장(cm): ");

        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double weight = scanner.nextDouble();

        //BMI 계산식 몸무게 / (키*키)
        double BMI_result = weight / ((height / 100.0) * (height / 100.0));

        String Obesity_Level = "비만";

        if (BMI_result > 23 && BMI_result <= 25) {
            Obesity_Level = "과체중";
        }
        if (BMI_result > 18.5 && BMI_result <= 23) {
            Obesity_Level = "정상";
        }
        if (BMI_result <= 18.5) {
            Obesity_Level = "저체중";
        }
        System.out.print("비만도 결과: " + Obesity_Level);
        System.out.println("BMI: " + BMI_result);
    }
}
