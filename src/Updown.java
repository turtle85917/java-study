import java.util.*;

public class Updown {
    public static void main(String[] args) {
        int tryCount = 0;
        int Answer = new Random().nextInt(19) + 1;
        boolean Gameover = false;

        while (!Gameover) {
            System.out.print("���� �Է��ϼ��� : ");
            Scanner in = new Scanner(System.in);

            String input = in.next();

            if (input.contains(".") || input.contains("-")) {
                System.out.println("������ �Է����ּ���.");
                continue;
            }

            try {
                int answer = Integer.parseInt(input);

                tryCount++;

                if (answer < Answer) System.out.println("Up!");
                if (answer > Answer) System.out.println("Down!");
                if (answer == Answer) Gameover = true;
            } catch (Exception error) {
                System.out.println("������ �����ϴ�. ������ ����� �Է��ߴ��� �ٽ� Ȯ�����ּ���.");
            }
        }

        System.out.println("���� ��.");
        System.out.println(tryCount + "ȸ���� ���߼̽��ϴ�.");
    }
}