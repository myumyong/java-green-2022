package data01;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class 사자 {
    private String name;
    private String color;
}

public class TestLomBok {
    public static void main(String[] args) {
        사자 lion = new 사자("사자", "노랑");
        lion.getName();
    }
}
