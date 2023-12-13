package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("한 개의 정수를 입력해주세요: ");
            int number = scanner.nextInt();


            if (number == 0) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

            sum += number;
            System.out.println("합계: " + sum);
        }
    }
}
