package ex07;

class Car {
    int speed = 10;
}

public class OOPEx01 {

    public static void main(String[] args) {
        // new는 heap에 할당하라는 키워드
        // Car 클래스가 가지고 있는 static이 아닌 모든 것들이 heap에 뜬다.
        Car s1 = new Car(); // Car는 타입, int랑 같은거, = 커스텀 타입 new Car();는 int a = 19;에서 19만 띄어놓은거랑 같다.
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car();
    }

}
