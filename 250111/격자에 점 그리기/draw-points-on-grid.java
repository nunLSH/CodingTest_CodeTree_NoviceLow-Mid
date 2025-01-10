import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n+1][n+1];
        int num = 1;

        for (int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            array[r][c] = num++;
        }

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
}