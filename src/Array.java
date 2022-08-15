public class Array {
    public static void main(String[] args) {
        int[] grade1 = new int[3];
        int[] grade2 = new int[3];

        grade1[0] = 85;
        grade1[1] = 65;
        grade1[2] = 90;

        grade2[0] = 85;

        for (int i = 0; i < grade1.length; i++) {
            System.out.print(grade1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < grade2.length; i++) {
            System.out.print(grade2[i] + " ");
        }

        int[] grade3 = {70, 90, 80};

        int[] grade4;
        grade4 =  new int[]{70, 90, 80};


        int[] grade5 = new int[]{85, 65, 90};
        int sum = 0;

        for (int i = 0; i < grade5.length; i++) {
            sum += grade5[i];
        }

        System.out.println();
        System.out.println("Total score : " + sum);
        System.out.println("Average score : " + (sum / grade5.length));

        int[][] arr1 = new int[2][3];

        int k = 10;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = k;
                k += 10;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}