package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);

            // 선 연결
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 버퍼 연결
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 버퍼 비워서 받아오기
            String responseJson = br.readLine();
            // System.out.println(responseJson);

            // gson이용해서 자바오브젝트로 변환
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);
            // System.out.println(dto.getData().get(0).getUser());

            // 통신검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패" + dto.getMsg());
                return; // 스택 종료
            }

            for (int i = 0; i < dto.getData().size(); i++) {
                System.out.println("목록 번호 : " + dto.getData().get(i).getId());
                System.out.println("목록 내용 : " + dto.getData().get(i).getContent());
                System.out.println("목록 만들어진 날짜 : " + dto.getData().get(i).getCreated());
                System.out.println("목록 업데이트된 날짜  : " + dto.getData().get(i).getUpdated());
                System.out.println((i + 1) + "번째 목록");

                System.out.println("====================================");
            }

            int idNum;
            Scanner sc = new Scanner(System.in);
            System.out.println("몇번째 목록의 회원 정보를 원하는지 숫자로 입력하세요");
            idNum = sc.nextInt();
            idNum = idNum - 1;
            System.out.println("================================");

            System.out.println("회원번호: " +
                    dto.getData().get(idNum).getUser().getId());
            System.out.println("회원이름: " +
                    dto.getData().get(idNum).getUser().getUsername());
            System.out.println("비밀번호: " +
                    dto.getData().get(idNum).getUser().getPassword());
            System.out.println("이메일: " +
                    dto.getData().get(idNum).getUser().getEmail());
            System.out.println("만들어진 날짜: " +
                    dto.getData().get(idNum).getUser().getCreated());
            System.out.println("업데이트된 날짜: " +
                    dto.getData().get(idNum).getUser().getUpdated());
            System.out.println("=================");

        } catch (Exception e) {
            e.printStackTrace();// 오류난 스택 출력해줌.
        }
    }
}
