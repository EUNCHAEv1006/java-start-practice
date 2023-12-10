package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 150;
        String transportion;

        if (distance <= 1) {
            transportion = "도보";
        } else if (distance <= 10 && distance > 1) {
            transportion = "자전거";
        } else if (distance <= 100 && distance > 10) {
            transportion = "자동차";
        } else {
            transportion = "비행기";
        }

        System.out.println(transportion + "를 이용하세요.");
    }
}
