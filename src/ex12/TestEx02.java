package ex12;

import java.security.Key;

interface Keymap2 {
    public abstract void q();

    public abstract void w();

    public abstract void e();

    public abstract void r();
}

class Zealot1 implements Keymap2 {
    public void q() {
        System.out.println("이것은 방어 질럿");
    }

    public void w() {
        System.out.println("이것은 공격 질럿");
    }

    public void e() {
        System.out.println("이것은 힐러질럿");
    }

    public void r() {
        System.out.println("이것은 궁극기질럿");
    }
}

class Dragoon1 implements Keymap2 {
    public void q() {
        System.out.println("이것은 방어 드라군");
    }

    public void w() {
        System.out.println("이것은 공격 드라군");
    }

    public void e() {
        System.out.println("이것은 힐러드라군");
    }

    public void r() {
        System.out.println("이것은 궁극기드라군");
    }
}

class Dia1 implements Keymap2 {
    public void q() {
        System.out.println("이것은 방어 다이아");
    }

    public void w() {
        System.out.println("이것은 공격 다이아");
    }

    public void e() {
        System.out.println("이것은 힐러다이아");
    }

    public void r() {
        System.out.println("이것은 궁극기다이아");
    }
}

class Mola1 implements Keymap2 {
    public void q() {
        System.out.println("이것은 방어 모라");
    }

    public void w() {
        System.out.println("이것은 공격 모라");
    }

    public void e() {
        System.out.println("이것은 힐러모라");
    }

    public void r() {
        System.out.println("이것은 궁극기모라");
    }
}

public class TestEx02 {
    public static void main(String[] args) {
        Keymap2 key = new Zealot1();
        Keymap2 key1 = new Dia1();
        Keymap2 key2 = new Mola1();
        Keymap2 key3 = new Dragoon1();

        key.q();
        key.w();
        key1.q();

    }
}
