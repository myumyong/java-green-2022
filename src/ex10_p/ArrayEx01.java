package ex10_p;

import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[STUDENTS];
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("성적을 입력하시오: ");
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < STUDENTS; i++) {
            total = total + scores[i];
        }
        System.out.println("평균 성적은 " + total / STUDENTS + "입니다.");

    }// 메인끝
}
