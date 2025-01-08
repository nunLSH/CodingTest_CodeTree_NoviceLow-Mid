import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int num = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i % 2 == 0){
                    array[j][i] = num++;
                }
                if (i % 2 != 0) {
                    array[n-1-j][i] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}