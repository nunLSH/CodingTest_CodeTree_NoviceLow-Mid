import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int k = 0; k < 4; k++)
                array[i][k] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 4; i++){
            for (int k = 0; k < i+1; k++)
                sum += array[i][k];
        }

        System.out.print(sum);
    }
}