import java.util.*;
public class Main {
    public static int k, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        n = sc.nextInt();
        int[][] rank = new int[k][n+1];
        for (int i = 0; i < k; i++){
            for (int j = 1; j <= n; j++){
                int dev = sc.nextInt();
                rank[i][dev] = j;
            }
        }

        int total = 0;
        for (int i = 1; i <= n; i++){ // a
            for (int j = 1; j <= n; j++){ // b
                if (i == j)
                    continue;

                int cnt = 0;
                for (int l = 0; l < k; l++){
                    if (rank[l][i] < rank[l][j])
                        cnt++;
                }

                if (cnt == k)
                    total++;
            }
        }
        System.out.print(total);
    }
}