package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {
        Doctor mDoctor = new Doctor(); // mDoctor은 할당 변수

        System.out.println(mDoctor.name);
        System.out.println(mDoctor.sal);
    }

}
