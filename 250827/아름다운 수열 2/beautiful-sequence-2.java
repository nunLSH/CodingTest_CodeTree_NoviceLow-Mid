import java.util.*;

public class Main {
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        Map<Integer, Integer> bCnt = new HashMap<>();
        for (int x : b) {
            bCnt.put(x, bCnt.getOrDefault(x, 0) + 1);
        } 

        int cnt = 0;
        for (int i = 0; i <= n - m; i++) {
            Map<Integer, Integer> aCnt = new HashMap<>();
            for (int j = 0; j < m; j++) {
                int val = a[i + j];
                aCnt.put(val, aCnt.getOrDefault(val, 0) + 1);
            }

            if (aCnt.equals(bCnt)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}