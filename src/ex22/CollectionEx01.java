package ex22;

import java.util.ArrayList;

interface Hello {
}

interface Haha {

}

class Bye implements Hello, Haha {

}

class Hi implements Hello {

}

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복가능한 데이터 모임.
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        datas.add("어..뭐지....당황스럽다..");
        datas.add("어..뭐지....당황스럽다..");
        datas.add("어..뭐지....당황스럽다..");
        datas.add("어..뭐지....당황스럽다..");
        datas.add("어..뭐지....당황스럽다..");

        datas.set(1, "응...그래");
        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        System.out.println(datas.get(3));
        System.out.println(datas.get(4));
    }
}
