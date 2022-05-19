import java.util.Scanner;

public class SecondhandMarket {
    public static void main(String[] args) {
        System.out.println("휴대폰 번호를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        int phone_num = scanner.nextInt();

        //입력받은 입력값의 뒷자리를 문자열로 변경

        // 받은값 01040202153 = 나누기 10000

        System.out.println("핸드폰 번호: " + "0" + phone_num);
        System.out.println("0" + phone_num / 10000 + "****");
    }
}
