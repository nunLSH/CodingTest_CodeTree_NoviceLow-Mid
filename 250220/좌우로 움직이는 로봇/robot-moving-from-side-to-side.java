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

        for (int j = timeA; j < MAX + 1; j++){
                a[j] = a[timeA - 1];
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

        for (int j = timeB; j < MAX + 1; j++){
            b[j] = b[timeB - 1];
        }
        
        int cnt = 0;
        for (int i = 2; i < MAX+1; i++){
            if (a[i] == b[i]){
                if (a[i-1] != b[i-1])
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}
