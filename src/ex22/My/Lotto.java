package ex22.My;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Random num = new Random();
        HashSet<Integer> lottoNums = new HashSet<>();

        // 6개의 로또 당첨 번호 정하기
        while (true) {
            int rNum = num.nextInt(45) + 1;
            lottoNums.add(rNum);

            if (lottoNums.size() == 6) {
                break;
            }
        }

        System.out.println(lottoNums);

        // ArrayList에 당첨 로또 번호 담기
        ArrayList<HashSet<Integer>> lottoArray = new ArrayList<>();
        lottoArray.add(lottoNums);

        System.out.println(lottoArray);

        // 금액 입력받기
        System.out.println("금액을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        money = money / 1000;
        System.out.println("로또 횟수: " + money);

        // 돌릴 로또 번호 ArrayList에 넣기
        ArrayList<HashSet<Integer>> lottoTestArray = new ArrayList<>();
        for (int i = 0; i < money; i++) {
            HashSet<Integer> lottoTestNums = new HashSet<>();
            while (true) {
                int rNum = num.nextInt(45) + 1;
                lottoTestNums.add(rNum);
                if (lottoTestNums.size() == 6) {
                    break;
                }
            }
            lottoTestArray.add(lottoTestNums);
        }

        System.out.println(lottoTestArray);

    }

    // 로또 번호 비교하기

}
