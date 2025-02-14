import java.util.Scanner;
public class Main {
    public static final int MAX = 1000 * 1000;
    public static int[] a = new int[MAX+1];
    public static int[] b = new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int curT_a = 1, curT_b = 1; // 현재 시간
        int cur_a = 0, cur_b = 0; // 현재 위치 

        // A
        for (int i = 0; i < n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            
            for (int j = curT_a; j < curT_a + t; j++){
                if (d == 'R'){
                    a[j] = ++cur_a;
                } else {
                    a[j] = --cur_a;
                }
            }
            curT_a = curT_a + t;
        }

        // B
        for (int i = 0; i < m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            for (int j = curT_b; j < curT_b + t; j++){
                if (d == 'R'){
                    b[j] = ++cur_b;
                } else {
                    b[j] = --cur_b;
                }
            }
            curT_b = curT_b + t;
        }

        int cnt = 0;
        for (int i = 1; i < curT_a; i++){
            if (a[i] == b[i]){
                System.out.println(i);
                break;
            } else {
                cnt++;
            }
        }
        
        if (cnt == curT_a -1)
            System.out.print(-1);
    }
}