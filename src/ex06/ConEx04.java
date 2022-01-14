package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) => 그게 아니라 이것이라면

        int point = 80;
        if (point >= 90) {
            System.out.println("A학점입니다.");
        } else if (point >= 80) {
            System.out.println("B학점입니다.");
        } else if (point >= 70) {
            System.out.println("C학점입니다.");
        } else if (point >= 60) {
            System.out.println("D학점입니다.");
        } else { // 왜 else를 사용해야 할까? 고민!!
            System.out.println("F학점입니다..ㅠ");
        }
    } // 메인 끝

}
