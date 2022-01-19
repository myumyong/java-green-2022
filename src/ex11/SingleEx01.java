package ex11;

//패턴-> 디자인 패턴 -> 설계도를 패턴으로 만들까?

class 튜브 {
    private static 튜브 instance = new 튜브();

    private 튜브() {

    }

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }
}

// 싱글톤 패턴
public class SingleEx01 {
    public static void main(String[] args) {
        튜브 tub1 = 튜브.getInstance();
        튜브 tub2 = 튜브.getInstance();

        System.out.println(tub1.hashCode());
        System.out.println(tub2.hashCode());
    }
}// 2022.01.18
