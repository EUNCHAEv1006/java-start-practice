package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        // 10 20 temp

        temp = a; // 10 20 10
        a = b; // 20 20 10
        b = temp; // 20 10 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
