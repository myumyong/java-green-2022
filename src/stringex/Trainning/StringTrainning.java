package stringex.Trainning;

import java.util.Scanner;

class Information {
    private String name;
    private String tel;
    private String gender;
    private char cGender;
    private String age;
    private int iAge;

    public Information(String name, String tel, String gender, String age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        String[] token;
        token = name.split(":");
        this.name = token[1];
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
        String[] token;
        token = tel.split(":");
        this.tel = token[1];
    }

    public char getGender() {
        return cGender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        String[] token;
        token = gender.split(":");
        cGender = token[1].charAt(0);
    }

    public int getAge() {
        return iAge;
    }

    public void setAge(String age) {
        this.age = age;
        String[] token;
        token = age.split(":");
        token[1] = token[1].trim();
        iAge = Integer.parseInt(token[1]);
    }
}

public class StringTrainning {
    public static void main(String[] args) {
        String name;
        String tel;
        String gender;
        String age;

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        // String data = "A01-이름:홍길동-전화번호:01025589456-성별:남-나이: 20";
        // System.out.println(data);
        String[] token = data.split("-");

        if (token[0].equals("A01")) {// 파싱시작
            name = token[1];
            tel = token[2];
            gender = token[3];// token[3];
            age = token[4];

            Information 정보 = new Information(name, tel, gender, age);
            정보.setName(name);
            정보.setTel(tel);
            정보.setGender(gender);
            정보.setAge(age);

            System.out.println("이름은 " + 정보.getName() + " 전화번호는 " + 정보.getTel() + " 성별은 "
                    + 정보.getGender() + " 나이는 " + 정보.getAge());
        } else {
            System.out.println("프로그램이 종료됩니다.");
        }

    }
}
