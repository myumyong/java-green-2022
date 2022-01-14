package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4자ㅣ 자료형 int, double, long, boolean
        // 2. 문자열 : 사이즈를 알 수 없다. 자료형이 아님!
        String s1 = "안녕하세요"; // s1은 4Byte로 스택에 저장,
        System.out.println(s1);
        String s2 = s1; // 주소가 저장된다. 스택에 4Byte 데이터가 들어가고, heap은 변하지 않는다.
        s2 = "바보";

        System.out.println(s1);
        System.out.println(s2);
    }
}
