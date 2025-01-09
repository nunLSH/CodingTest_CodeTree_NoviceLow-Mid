import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int num = n*n;

        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                for (int j = n-1; j >= 0; j--)
                    array[j][i] = num--;
            }
            if (i % 2 != 0){
                for (int j = 0; j < n; j++)
                    array[j][i] = num--;
            }
        }

        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++)
                System.out.print(array[i][k]+" ");
            System.out.println();
        }
    }
}