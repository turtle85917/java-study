public class Statement {
    public static void main(String[] args) {
        char ch1 = 'j';
        if (ch1 >= 'a' && ch1 <= 'z') {
            System.out.println("It's small letter.");
        }

        char ch2 = 'J';
        if (ch2 >= 'a' && ch2 <= 'z') {
            System.out.println("It's small letter.");
        } else {
            System.out.println("It's not small letter.");
        }

        char ch3 = 'J';
        if (ch3 >= 'a' && ch2 <= 'z') {
            System.out.println("It's small letter.");
        } else if (ch3 >= 'A' && ch3 <= 'Z') {
            System.out.println("It's big letter.");
        } else {
            System.out.println("It's not English characters.");
        }

        char ch4 = 'i';
        switch (ch4) {
            case 'a':
                System.out.println("This letter is 'A'.");
                break;
            case 'e':
                System.out.println("This letter is 'E'.");
                break;
            case 'i':
                System.out.println("This letter is 'I'.");
                break;
            case 'o':
                System.out.println("This letter is 'O'.");
                break;
            case 'u':
                System.out.println("This letter is 'U'.");
                break;
            default:
                System.out.println("This letter is not a vowel.");
                break;
        }

        char ch5 = 'E';
        switch (ch5) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This letter is vowel. (small");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This letter is vowel. (big");
                break;
            default:
                System.out.println("This letter is not a vowel.");
                break;
        }

        int num1 = 0;

        while (num1 < 5) {
            System.out.println("while running : " + (num1 + 1));
            num1++;
        }

        System.out.println("while end : " + num1);

        int num2 = 0;
        do {
            System.out.println("do / while running : " + (num2 + 1));
            num2++;
        } while (num2 < 1);

        System.out.println("do / while end : " + num2);

        for (int i = 0; i < 5; i++) {
            System.out.println("for running : " + (i + 1));
        }

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }

        int num = 0, sum = 0;
        while (true) {
            sum += num;
            if (num == 100) {
                break;
            }
            num++;
        }
        System.out.println(sum);

        allLoop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}