import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        int proizved1 ;
        int proizved2 ;
        int prom ;

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

        proizved1 = array[0][0];
        for ( int i = 0; i < 3; i++) {
            proizved1 = proizved1 * array[i+1][i+1];
        }
        System.out.println(proizved1);

        proizved2 = array[3][0];
        int x = array.length - 1;
        for (int i = x; i >= 0 ; i--){
            if (i == 3) {
                continue;
            }
            prom = array[i][x - i];
            proizved2 = proizved2 * prom;
        }
        System.out.println(proizved2);
        if (proizved1 > proizved2) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else {
            System.out.println("Произведение побочной диагонали больше");
        }
    }
}
