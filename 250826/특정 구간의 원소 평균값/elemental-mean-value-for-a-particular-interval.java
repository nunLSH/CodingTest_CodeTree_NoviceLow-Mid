import java.util.*;
public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] num = new int[n+1];
        for (int i = 1; i <= n; i++)
            num[i] = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++){ // 크기
            for (int k = 1; k < n+2 - i; k++){ // 시작점
                double sum = 0;
                for (int j = k; j < k+i; j++){  // 구간
                    sum += num[j];
                }

                boolean isSame = false;
                for (int t = k; t < k+i; t++){
                    if (sum / i == (double) num[t])
                        isSame = true;
                    
                }
                if (isSame)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}