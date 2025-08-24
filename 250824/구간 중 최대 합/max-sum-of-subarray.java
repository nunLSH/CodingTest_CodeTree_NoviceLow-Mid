import java.util.*;
public class Main {
    public static int n, k;
    public static final int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        int max = MAX;
        for (int i = 0; i <= n-k; i++){
            int sum = 0, cnt = k;
            while (cnt > 0){
                sum += num[i+k-cnt];
                cnt--;
            }
            max = Math.max(sum, max);
        }
        System.out.print(max);
    }
}