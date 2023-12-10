package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount+1000;
            System.out.println("10,000원 이상 구매시 1,000원 할인");
        } else if (age <= 10) {
            discount = discount+1000;
            System.out.println("10살 이하는 1,000원 할인");
        }

        if (age <= 10) {
            discount = discount+1000;
            System.out.println("10살 이하는 1,000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
