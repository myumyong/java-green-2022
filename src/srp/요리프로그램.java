package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        손님 customer = new 손님();
        종업원 maneger = new 종업원();
        요리사 chef = new 요리사();

        customer.주문하기(maneger, chef);
    }
}
