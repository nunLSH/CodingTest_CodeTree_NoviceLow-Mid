import java.util.Scanner;
public class Main {
    public static final int MAX = 1000 * 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[MAX+1];
        int[] b = new int[MAX+1];
        
        int timeA = 1, timeB = 1;
        for (int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            while (t-- > 0){
                a[timeA] = a[timeA - 1] + v;
                timeA++;
            }
        }
        for (int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            while (t-- > 0){
                b[timeB] = b[timeB - 1] + v;
                timeB++;
            }
        }
    
        int leader = 0;
        int cnt = 0;
        for (int i = 1; i < timeA; i++){
            if (a[i] > b[i]){
                if (leader != 1)
                    cnt++;
                leader = 1;
            } else if (a[i] < b[i]){
                if (leader != 2)
                    cnt++;
                leader = 2;
            } else {
                if (leader != 3)
                    cnt++;
                leader = 3;
            }
        }

        System.out.print(cnt);
    }
}