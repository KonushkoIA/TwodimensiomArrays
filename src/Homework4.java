import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(50) + 1;
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for ( int i = 0; i < 4; i++) {
            for (int j = 2 - i; j >= 0 ; j--){
                if (array[i][j] % 2 == 0){
                sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов над побочной диагональю ( не включительно ) = " + sum);
    }
}

