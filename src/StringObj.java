public class StringObj {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("Original : " + str);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\ncharAt() ÈÄ Original : " + str);


    }
}