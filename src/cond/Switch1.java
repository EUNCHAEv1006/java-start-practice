package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;

        if (grade == 1) {
            coupon = coupon + 1000;
        } else if (grade == 2) {
            coupon = coupon + 2000;
        } else if (grade == 3) {
            coupon = coupon + 3000;
        } else {
            coupon = coupon + 500;
        }
            System.out.println("발급받은 쿠폰 " + coupon);
    }
}
