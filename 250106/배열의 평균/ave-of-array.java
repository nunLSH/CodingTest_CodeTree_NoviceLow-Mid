import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[2][4];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++)
                array[i][j] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++){
            int widSum = 0;
            for (int j = 0; j < 4; j++){
                widSum += array[i][j];
            }
            System.out.printf("%.1f ", (double) widSum / 4);
        }
        System.out.println();

        int totalSum = 0;
        for (int i = 0; i < 4; i++){
            int heiSum = 0;
            for (int j = 0; j < 2; j++){
                heiSum += array[j][i];
                totalSum += array[j][i];
            }
            System.out.printf("%.1f ", (double) heiSum / 2);
        }
        System.out.println();

        System.out.printf("%.1f ", (double) totalSum / 8);
    }
}