import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = sc.nextInt();
        
        int sum1 = 0, sum2 = 0;
        int total = 0, maxCnt = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-2; j++){
                for (int k = i+1; k < n; k++){
                    for (int t = 0; t < n-2; t++){
                        sum1 = board[i][j] + board[i][j+1] + board[i][j+2];
                        sum2 = board[k][t] + board[k][t+1] + board[k][t+2];
                        total = sum1 + sum2;
                        maxCnt = Math.max(total, maxCnt);
                    }
                }
            }
            if (n >= 5){
                for (int j2 = 0; j2 < n-2; j2++){
                    for (int k2 = j2+3; k2 < n-2; k2++){
                        sum1 = board[i][j2] + board[i][j2+1] + board[i][j2+2];
                        sum2 = board[i][k2] + board[i][k2+1] + board[i][k2+2];
                        total = sum1 + sum2;
                        maxCnt = Math.max(total, maxCnt);
                    }
                }
            }
        }
        System.out.print(maxCnt);
    }
}