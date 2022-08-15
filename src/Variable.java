public class Variable {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        double num2 = 5.2;
        System.out.println(num2);

        byte num3 = 127;
        byte num4 = -128;

        num3++;
        num4--;

        System.out.println(num3);
        System.out.println(num4);

        String str = "Hello world!";
        System.out.println(str);

        double num5 = 3.12;
        int num6 = 2;
        num6 = (int) num5;
        System.out.println(num6);

        double num7 = 9.0f + 1.21;
        int num8 = 2;
        num8 = (int) num7;
        System.out.println(num8);
    }
}