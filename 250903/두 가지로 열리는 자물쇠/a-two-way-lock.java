import java.util.*;
public class Main {
    public static int n, a, b, c, a2, b2, c2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();
    
        int cnt = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= n; k++){
                    if((Math.abs(a - i) <= 2 || Math.abs(a - i) >= n - 2) && (Math.abs(b - j) <= 2 || Math.abs(b - j) >= n - 2) && 
                       (Math.abs(c - k) <= 2 || Math.abs(c - k) >= n - 2))
                        cnt++;

                    else if((Math.abs(a2 - i) <= 2 || Math.abs(a2 - i) >= n - 2) && (Math.abs(b2 - j) <= 2 || Math.abs(b2 - j) >= n - 2) && 
                       (Math.abs(c2 - k) <= 2 || Math.abs(c2 - k) >= n - 2))
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}