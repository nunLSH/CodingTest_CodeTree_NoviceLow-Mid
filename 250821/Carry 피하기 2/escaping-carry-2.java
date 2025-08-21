import java.util.*;
public class Main {

    private static boolean noCarry(int a, int b, int c) {
        while (a > 0 || b > 0 || c > 0) {
            int da = a % 10;
            int db = b % 10;
            int dc = c % 10;
            if (da + db + dc >= 10) return false; 
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) 
            num[i] = sc.nextInt();

        int max = -1; 

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (noCarry(num[i], num[j], num[k])) {
                        max = Math.max(max, num[i] + num[j] + num[k]);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
