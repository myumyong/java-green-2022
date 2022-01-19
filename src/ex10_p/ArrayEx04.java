package ex10_p;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {
        int total = 0;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 수를 입력하세요: ");
        size = sc.nextInt();
        int[] scores = new int[size];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("성적을 입력하세요:");
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }

        System.out.println("평균점수는 " + total / scores.length + "점 입니다.");

    }
}
