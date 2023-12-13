package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("문자열을 입력해주세요: ");
//        String stringValue = scanner.nextLine();
//
//        String answer = "exit";
//
//        while (answer != stringValue) {
//            System.out.println("정답이 아닙니다. exit를 입력해주세요.");
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료): ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                // 문자열은 ==이 아니라 .equals 사용!!!!!!!
                break;
            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
