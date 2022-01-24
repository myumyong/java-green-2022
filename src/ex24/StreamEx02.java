package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class StreamEx02 {
    public static void main(String[] args) {
        // 한자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 고정된 길이의 문자를 받을 수 있다.
        InputStreamReader ir = new InputStreamReader(in);

        char[] data = new char[3];
        try {
            ir.read(data);
            System.out.println(data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 단점 정리
    }// main of end
}
