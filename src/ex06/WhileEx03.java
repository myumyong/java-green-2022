package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임 (500, 100, 50, 10)
        int money = 2580; // 500*5, 100*1, 50*1,10*3

        int restMoney = money;

        int coin;

        // 1. 500원 동전 구하기
        coin = 500;
        System.out.println(coin + "원: " + restMoney / coin + "개");
        restMoney = restMoney % coin;

        // 2. 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원: " + restMoney / coin + "개");
        restMoney = restMoney % coin;

        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원: " + restMoney / coin + "개");
        restMoney = restMoney % coin;

        // 4. 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원: " + restMoney / coin + "개");
    }// 메인끝
}
