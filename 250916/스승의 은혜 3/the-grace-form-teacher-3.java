import java.util.*;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int maxCnt = 0;
        for (int i = 0; i < n; i++){ // 쿠폰을 사용할 학생
            int sum = 0, cnt = 0;
            for (int j = 0; j < n; j++){

                if (i == j)                
                    sum += p[i] / 2 + s[i];

                sum += p[i] + s[i];

                if (sum > b)
                    maxCnt = Math.max(cnt, maxCnt);
                
                cnt++;

            }
        }
        System.out.print(maxCnt);
    }
}