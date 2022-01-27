package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Users {
    private int id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;

    @AllArgsConstructor
    @Data
    class User {
        private int id;
        private String username;
        private String password;
        private String email;
        private String created;
        private String updated;
    }
}
