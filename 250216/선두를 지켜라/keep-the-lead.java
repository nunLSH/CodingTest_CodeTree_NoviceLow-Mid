import java.util.Scanner;
public class Main {
    public static final int MAX = 1000 * 1000;
    public static int[] a = new int[MAX + 1];
    public static int[] b = new int[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1, timeB = 1;
        int curA = 0, curB = 0;

        for (int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = timeA; j < timeA + t; j++){
                curA += v;
                a[j] = curA;
            }
            timeA += t;
        }

        for (int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = timeB; j < timeB + t; j++){
                curB += v;
                b[j] = curB;
            }
            timeB += t;
        }

        int cnt = 0;
        boolean aIsFirst = false;
        for (int i = 1; i <= timeA; i++){
            if (a[i] > b[i]){
                if (aIsFirst == false)
                    cnt++;
                aIsFirst = true;
            } else if (a[i] < b[i]) {
                if (aIsFirst == true)
                    cnt++;
                aIsFirst = false;
            }
        }
        System.out.print(cnt);
    }
}