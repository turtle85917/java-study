import java.util.*;

public class Updown {
    public static void main(String[] args) {
        int tryCount = 0;
        int Answer = new Random().nextInt(19) + 1;
        boolean Gameover = false;

        while (!Gameover) {
            System.out.print("값을 입력하세요 : ");
            Scanner in = new Scanner(System.in);

            String input = in.next();

            if (input.contains(".") || input.contains("-")) {
                System.out.println("정수로 입력해주세요.");
                continue;
            }

            try {
                int answer = Integer.parseInt(input);

                tryCount++;

                if (answer < Answer) System.out.println("Up!");
                if (answer > Answer) System.out.println("Down!");
                if (answer == Answer) Gameover = true;
            } catch (Exception error) {
                System.out.println("오류가 났습니다. 정수로 제대로 입력했는지 다시 확인해주세요.");
            }
        }

        System.out.println("게임 끝.");
        System.out.println(tryCount + "회만에 맞추셨습니다.");
    }
}