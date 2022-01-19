package srp;

//종업원 - 요리사(의존성)
public class 종업원 {
    public 음식 주문받기(요리사 chef) { // 요리사는 종업원에 의존적이기 때문에 매개변수를 받는다.
        음식 jjajjang = chef.음식생성();
        return jjajjang; // null 아무것도 없음.
    }
}
