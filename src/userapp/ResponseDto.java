package userapp;

import java.util.List;//같은 패키지에 있게 해주는게 import

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1은 성공 , -1은 실패, 0은 데이터 없음.
    private String msg; // 실패의 원인
    private List<User> data;
}
