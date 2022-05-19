import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("운동 종류:");

        String workout_type = scanner.next();
        //지원 운동 종류 목록 생성 (추가 운동목록 더하고 빼기 쉽게)
        String[] workoutArray = {"자전거", "걷기", "달리기"};

        ArrayList<String> available_workout_type = new ArrayList<>(Arrays.asList(workoutArray));
        //지원되는 운동만 입력가능하게 조건 입력
        if (available_workout_type.contains(workout_type)) {
            System.out.print("체중(kg): ");
        }
        if (!available_workout_type.contains(workout_type)) {
            System.out.println("지원하지 않는 운동입니다.");
            System.exit(1);
        }
        int weight = scanner.nextInt();

        System.out.print("운동 시간(분): ");
        int workout_time = scanner.nextInt();
        //운동계수 해당하는 변수 생성 및 식 생성
        double workout_index =0;


        if (workout_type.equals("자전거")) {
            workout_index = 2.3;
        }
        if (workout_type.equals("걷기")) {
            workout_index = 0.9;
        }
        if (workout_type.equals("달리기")) {
            workout_index = 2.0;
        }
        double result = (workout_index) / 15.0 * weight * workout_time;
        //결과 값 식 생성
        System.out.println("칼로리 소모: " + result + "kcal");
    }
}


