package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // 3. \n을 입력으로 보고 나이 입력으로 넘어감

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 1. 나이를 30이라고 입력하면 30을 사용하고 \n이 남기 때문에
            input.nextLine(); // 2. 여기서 남은 \n을 처리 안해주면 4. 그래서 input.nextLine()을 사용함

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

    }
}
