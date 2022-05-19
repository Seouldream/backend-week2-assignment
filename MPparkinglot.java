import java.util.Scanner;

public class MPparkinglot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이용시간 (분): ");

        int ServiceTime = scanner.nextInt();

        System.out.print("파킹존 주차여부: ");


        String ox = scanner.next();


        //계산식 (기본요금 + 시간*150 ) * 9/10   or 위요금 +3000원

        if (ox.equals("o")) {
            System.out.println("요금: " + ((1000 + (ServiceTime * 150)) * 9 / 10) + "원");
        }
        if (ox.equals("x")) {
            System.out.println("요금: " + (1000 + (ServiceTime * 150) + 3000) + " 원");
        }
    }
}

