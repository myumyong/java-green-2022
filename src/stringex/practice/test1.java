package stringex.practice;

public class test1 {
    public static void main(String[] args) {
        String str = "apple";
        boolean startsWith = str.startsWith("a");
        System.out.println("startsWith: " + startsWith);

        str = "test";
        boolean endsWith = str.endsWith("t");
        System.out.println("endsWith: " + endsWith);

        String str1 = "java";
        String str2 = "java";
        boolean equals = str1.equals(str2);
        System.out.println("equals: " + equals);

        str = "abcdef";
        int idexOf = str.indexOf("c");
        System.out.println("indexOf : " + idexOf);

        str = "AdnroidApp";
        int lastIndexOf = str.lastIndexOf("A");
        System.out.println("lastIndexOf: " + lastIndexOf);

        str = "abcdef";
        int length = str.length();
        System.out.println("length: " + length);

        str = "A*B*C*D";
        String replace = str.replace("*", "-");
        System.out.println(replace);

        str = "A:B:C:D:abcd";
        String[] split = str.split(":");
        System.out.println("split: " + split[4]);

        str = "ABCDEF";
        String substring = str.substring(0, 2);
        System.out.println("substring: " + substring);

        str = "abcDEF";
        String toLowerCase = str.toLowerCase();
        System.out.println("소문자 변환: " + toLowerCase);

        str = "abcDEF";
        String toUppercase = str.toUpperCase();
        System.out.println("대문자 변환: " + toUppercase);

        str = "1234";
        String toString = str.toString();
        System.out.println("toString: " + toString);

        String s = "     java java java     ";
        String v;
        v = s.trim();
        System.out.println("trim: " + v);

        int i = 12345;
        long l = 1L;
        char c = '1';
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(c));

        str1 = "D";
        str2 = "B";
        int compareTo = str1.compareTo(str2);// compareTo = 아스키코드값으로 strl1 - str2
        System.out.println("========");
        System.out.println(compareTo);
        if (compareTo > 0) {
            System.out.println(str1 + " > " + str2);
        } else if (compareTo == 0) {
            System.out.println(str1 + " = " + str2);
        } else {
            System.out.println(str1 + " < " + str2);
        }

        str = "charAt";
        char charAt = str.charAt(2);
        System.out.println("charAt: " + charAt);

        str1 = "Han";
        str2 = "SeeJin";
        String concat = str1.concat(str2);
        System.out.println(concat);

        int a = 123456789;
        str = String.format("%,d", a);
        System.out.println(str);

        int b = 123456;
        str = String.format("%,d", b);
        String d = "123456";
        boolean matches = str.matches(d);
        System.out.println("matches: " + matches);

        str = "Aman";
        String replaceFirst = str.replaceFirst("A", "Super");
        System.out.println("replaceFirst: " + replaceFirst);

    }
}
