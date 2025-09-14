import java.util.*;
public class Main {
    public static int n, k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        int[] bombs = new int[n];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        
        int maxNum = -1;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (bombs[i] == bombs[j]){
                    if (j-i <= k){
                        maxNum = Math.max(maxNum, bombs[j]);
                    }
                }
            }
        }
        System.out.print(maxNum);
    }
}