package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(int id, String username, ...풀 생성자)
@Data // Getter, Setter, toString 자동생성
// 둘다 실행시에 만들어주기때문에 상태가 변경되도 알아서 같이 변경됨.
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
