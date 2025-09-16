import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int maxCnt = 0;
        // 쿠폰 사용 X
        int[] baseCosts = new int[n];
        for (int j = 0; j < n; j++) 
            baseCosts[j] = p[j] + s[j];
        Arrays.sort(baseCosts);

        int sum = 0, cnt = 0;
        for (int k = 0; k < n; k++) {
            sum += baseCosts[k];
            if (sum > b) break;
            cnt++;
        }
        maxCnt = Math.max(maxCnt, cnt);

        // i번 학생에게 쿠폰
        for (int i = 0; i < n; i++) {
            int[] costs = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) costs[j] = p[j] / 2 + s[j];
                else costs[j] = p[j] + s[j];           
            }
            Arrays.sort(costs);

            sum = 0;
            cnt = 0;
            for (int k = 0; k < n; k++) {
                sum += costs[k];
                if (sum > b) break;
                cnt++;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.print(maxCnt);
    }
}
