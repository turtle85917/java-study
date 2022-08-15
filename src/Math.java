public class Math {
    public static void main(String[] args) {
        // 기초 연산
        int num1 = 8, num2 = 4;
        System.out.println("+ : " + (num1 + num2));
        System.out.println("- : " + (num1 - num2));
        System.out.println("* : " + (num1 * num2));
        System.out.println("/ : " + (num1 / num2));
        System.out.println("% : " + (num1 % num2));

        // 등호를 사용한 연산
        int num3 = 7, num4 = 7, num5 = 7;

        num3 = num3 - 3;
        num4 -= 3;
        num5 =- 3;

        System.out.println("- : " + num3);
        System.out.println("-= : " + num4);
        System.out.println("=- : " + num5);

        // 감소 연산자의 위치
        int num6 = 7, num7 = 7;
        int result1, result2;

        result1 = --num6 + 4;
        result2 = num7-- + 4;

        System.out.println("--var : " + result1 + " , variable : " + num6);
        System.out.println("++var : " + result2 + " , variable : " + num7);

        int x = 10;
        int y = x-- + 5 + --x;
        System.out.println("x : " + x + " , y : " + y);

        // 부등호의 연산
        char ch1 = 'a', ch2 = 'A';
        System.out.println("== : " + (ch1 == ch2));
        System.out.println("> : " + (ch1 > ch2));

        char ch3 = 'b', ch4 = 'B';
        boolean result3, result4;

        result3 = (ch3 > 'a') && (ch3 < 'z');
        result4 = (ch4 < 'A') || (ch4 < 'Z');

        System.out.println("&& : " + result3);
        System.out.println("|| : " + result4);
        System.out.println("! : " + !result4);

        // 비트 연산자
        int num8 = 8, num9 = -8;

        System.out.println("~ : " + ~num8);
        System.out.println("<< : " + (num8 << 2));
        System.out.println(">> : " + (num9 >> 2));
        System.out.println(">>> : " + (num8 >>> 2));
        System.out.println(">>> : " + (num9 >>> 2));

        int num10 = 5, num11 = 7;
        int result5;

        result5 = (num10 - num11 > 0) ? num10 : num11;
        System.out.println("Big variable : " + result5);
    }
}