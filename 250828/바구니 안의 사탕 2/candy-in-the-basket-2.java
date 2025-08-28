import java.util.*;
public class Main {
    public static int n, k;
    public static int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        int[] candy = new int[MAX+1];
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            int pos = sc.nextInt();
            candy[pos] += num;
        }

        int maxCnt = 0;
        for (int i = 0; i < 100; i++){ // 시작점
            int sumCnt = 0;
            for (int j = i; j <= i+2*k; j++){
                sumCnt += candy[j];
            }
            maxCnt = Math.max(maxCnt, sumCnt);
        }
        System.out.print(maxCnt);
    }
}