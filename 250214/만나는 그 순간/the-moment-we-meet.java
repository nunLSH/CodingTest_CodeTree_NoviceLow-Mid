import java.util.Scanner;
public class Main {
    public static final int MAX = 1000 * 1000;
    public static int[] a = new int[MAX+1];
    public static int[] b = new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1, timeB = 1; // 현재 시간
        int posA = 0, posB = 0; // 현재 위치 

        // A
        for (int i = 0; i < n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            
            while (t-- > 0){
                if (d == 'R')
                    a[timeA] = ++posA;
                else 
                    a[timeA] = --posA;

                timeA++;
            }
        }

        // B
        for (int i = 0; i < m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R')
                    b[timeB] = ++posB;
                else 
                    b[timeB] = --posB;

                timeB++;
            }
        }

        int ans = -1;
        for (int i = 1; i < timeA; i++){
            if (a[i] == b[i]){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}