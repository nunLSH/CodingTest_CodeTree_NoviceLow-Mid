import java.util.*;
public class Main {
    public static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        int max = 0;
        for (int i = 0; i <= n-k; i++){
            int sum = 0;
            for (int j = i; j < i+k; j++)
                sum += num[j];
            max = Math.max(sum, max);
        }
        System.out.print(max);
    }
}