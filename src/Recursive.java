class Math_ {
    static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
}

public class Recursive {
    public static void main(String[] args) {
        System.out.println(Math_.recursiveSum(10));
    }
}