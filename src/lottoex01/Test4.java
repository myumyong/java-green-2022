package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        // 4.HashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요!! (구글링)
        // Mock
        Set<Integer> lotto = new HashSet<>();
        lotto.add(20);
        lotto.add(7);
        lotto.add(3);
        lotto.add(45);
        lotto.add(5);
        lotto.add(6);

        System.out.println(lotto);

        // Test
        List<Integer> sortedList = new ArrayList<>(lotto);
        Collections.sort(sortedList);

        // 눈으로 확인
        System.out.println(sortedList);

        // 검증
        int failCheck = 0;
        // if (sortedList.get(0) < sortedList.get(1)) {
        // System.out.println("0번지 1번지 비교-성공");
        // } else {
        // failCheck++;
        // }

        // if (sortedList.get(1) < sortedList.get(2)) {
        // System.out.println("1번지 2번지 비교-성공");
        // } else {
        // failCheck++;
        // }

        // if (sortedList.get(2) < sortedList.get(3)) {
        // System.out.println("2번지 3번지 비교-성공");
        // } else {
        // failCheck++;
        // }

        // if (sortedList.get(3) < sortedList.get(4)) {
        // System.out.println("3번지 4번지 비교-성공");
        // } else {
        // failCheck++;
        // }

        // if (sortedList.get(4) < sortedList.get(5)) {
        // System.out.println("4번지 5번지 비교-성공");
        // } else {
        // failCheck++;
        // }

        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i) < sortedList.get(i + 1)) {
                System.out.println(i + "번지 " + (i + 1) + "번지 비교-성공");
            } else {
                failCheck++;
            }
        }
        if (failCheck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
