import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] coins = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                coins[i][j] = sc.nextInt();
        
        int maxCoins = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-2; j++){
                int sumCoins = coins[i][j] + coins[i][j+1] + coins[i][j+2];
                maxCoins = Math.max(sumCoins, maxCoins);
            }
        }
        System.out.print(maxCoins);
    }
}