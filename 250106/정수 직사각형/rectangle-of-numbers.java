import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int num = 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = num;
                num++;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}