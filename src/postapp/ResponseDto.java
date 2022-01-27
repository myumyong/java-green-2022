package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1이면 정상, -1이면 실패, 0은 데이터 없음.
    private String msg;
    private List<Users> data;

}
