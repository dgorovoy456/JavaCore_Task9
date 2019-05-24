public class Pyramid {

    public static void printPyramid(int h) {

        int num = 1;
        for (int i = h; i >= 0; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            for (int j = num - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            num++;
        }
    }
}
