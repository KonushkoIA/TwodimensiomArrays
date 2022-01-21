import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for ( int i = 0; i < 4; i++) {
            for ( int j = 0 ; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
