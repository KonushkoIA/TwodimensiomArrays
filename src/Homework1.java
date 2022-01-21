import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
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
        for (int i = 0; i < 4; i++){
            if (array[i][i] % 2 == 0) {
            sum += array[i][i];}
        }
        System.out.println();
        System.out.println(sum);
    }
}
