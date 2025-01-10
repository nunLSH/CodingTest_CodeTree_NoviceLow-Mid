import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][n];
        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++){
            row = sc.nextInt();
            col = sc.nextInt();

            array[row-1][col-1] = 1;
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}