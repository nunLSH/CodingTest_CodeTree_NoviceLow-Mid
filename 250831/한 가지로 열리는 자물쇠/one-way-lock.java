import java.util.*;
public class Main {
    public static int n, a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= n; k++){
                    int dis1 = Math.abs(a-i);
                    int dis2 = Math.abs(b-j);
                    int dis3 = Math.abs(c-k);
                    if (dis1 > 2 && dis2 > 2 && dis3 > 2)
                        cnt++;
                }
            }
        }
        System.out.print(n*n*n - cnt);
    }
}