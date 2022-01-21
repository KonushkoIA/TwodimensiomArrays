import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        int prom;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(50) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                prom = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = prom;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}