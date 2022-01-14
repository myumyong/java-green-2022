package ex07;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("출력할 구구단의 범위를 입력하시오.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = n1; n1 <= n2; n1++) {
            for (int step = 1; step < 10; step++) {
                System.out.println(n1 + "*" + step + "=" + n1 * step);
            }
            System.out.println(" ");
        }
    }
}
