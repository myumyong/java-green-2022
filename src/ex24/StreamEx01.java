package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)가 자바(목적지)에 Stream이 연결된다.
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println(n);
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
            System.out.println("에러");

        } // 단점 정리

    }// main of end
}
