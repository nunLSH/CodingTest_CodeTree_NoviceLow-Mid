import java.util.Scanner;
public class Main {
    public static final int MAX = 1000000; 
    public static int[] a = new int[MAX+1];
    public static int[] b = new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1, timeB = 1;
        for (int i = 0; i < n; i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if (d == 'L'){
                    a[timeA] = a[timeA++ - 1] - 1;
                } else {
                    a[timeA] = a[timeA++ - 1] + 1;
                }
            }
        }

        for (int i = 0; i < m; i++){
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            
            while(t-- > 0) {
                if (d == 'L'){
                    b[timeB] = b[timeB++ - 1] - 1;
                } else {
                    b[timeB] = b[timeB++ - 1] + 1;
                }
            }
        }

        int maxTime = 0;
        if (timeA < timeB) {
            for (int i = timeA; i < timeB; i++){
                a[i] = a[i - 1];
            }
            maxTime = timeB;
        } else if (timeB < timeA) {
            for (int i = timeB; i < timeA; i++){
                b[i] = b[i - 1];
            }
            maxTime = timeA;
        }
        
        int cnt = 0;
        for (int i = 2; i < maxTime; i++){
            if (a[i] == b[i] && a[i-1] != b[i-1]){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
