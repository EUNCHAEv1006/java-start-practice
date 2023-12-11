package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        /*
        rows = 2 라면
        1. *
        2. ** 인데.. 음

        for ( 1 ~ rows까지 돌고) {
            println(*)
        }
        => 이렇게하면 결과가
        *
        * 이겠지?

        근데 나는 두번째 줄 부터 추가하고 싶어.
        오 그러면

        for ( 1 ~ rows까지 돌고) {
            for (2 ~ rows)까지 {
                print(*)
            }
            println(*)
        }
        => 이렇게하면 결과가
        *****
        *****
        *****
        *****
        *****

         */


        int rows = 10;

        for (int i = 1; i <= rows; i++) {

            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("*");
        }


    }
}
