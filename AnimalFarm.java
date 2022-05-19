import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {
        //개 닭 돼지 = 3마리
        Scanner scanner = new Scanner(System.in);
        System.out.println("동물 이름을 어디 한 번 입력해보아라.");

        String AnimalType = scanner.nextLine();

        if (AnimalType.equals("닭")) {
            System.out.println("동물 이름 :" + AnimalType);
            System.out.println("꼬꼬댁");
        }
        if (AnimalType.equals("돼지")) {
            System.out.println("동물 이름 :" + AnimalType);
            System.out.println("꿀꿀");
        }
        if (AnimalType.equals("개")) {
            System.out.println("동물 이름 :" + AnimalType);
            System.out.println("멍멍");
        } else {
            System.out.println("우리 농장에는 그 동물이 없습니다.");
        }

    }
}
