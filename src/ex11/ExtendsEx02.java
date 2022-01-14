package ex11;

class 동물 {
    String name;
    int hp;
    int attack;
    int attackedHp;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attac() {
        return attack;
    }

    int attackeHp(int a, int b) {
        attackedHp = a - b;
        hp = attackedHp;
        return hp;
    }
}

class 사자 extends 동물 {
    // 이름 내뱉는 함수
    String name = "사자";
    int hp = 100;
    int attack = 10;
    int attackedHp;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attac() {
        return attack;
    }

    int attackeHp(int a, int b) {
        attackedHp = a - b;
        hp = attackedHp;
        return hp;
    }
}

class 호랑이 extends 동물 {
    // 이름 내뱉는 함수
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
    int attackedHp;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attac() {
        return attack;
    }

    int attackeHp(int a, int b) {
        attackedHp = a - b;
        hp = attackedHp;
        return hp;
    }
}

class 곰 extends 동물 {
    // 이름 내뱉는 함수
    String name = "곰";
    int hp = 100;
    int attack = 50;
    int attackedHp;

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    int attac() {
        return attack;
    }

    int attackeHp(int a, int b) {
        attackedHp = a - b;
        hp = attackedHp;
        return hp;
    }
}

public class ExtendsEx02 {

    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        int unit2Hp, unit1Attack;
        unit2Hp = unit2.hp();
        unit1Attack = unit1.attac();

        System.out.println(unit2.name() + "가 " + unit1.name() + "에게 공격당하고 있습니다.");
        System.out.println(unit2.name() + "의 hp : " + unit2.attackeHp(unit2Hp,
                unit1Attack));
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        attack(lion, tiger);
        attack(lion, bear);
        attack(bear, lion);
        attack(tiger, lion);
    }
}// 2022.01.14..