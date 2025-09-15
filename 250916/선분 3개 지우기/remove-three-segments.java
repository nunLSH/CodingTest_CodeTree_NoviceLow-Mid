
import java.util.*;

public class Main {
    public static final int MAX_A = 100;
    public static final int MAX_N = 10;
    
    public static int n;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
            
                    boolean overlap = false;
                    int[] lines = new int[MAX_A + 1];

                    for(int x = 0; x < n; x++) {
                        if(x == i || x == j || x == k)
                            continue;
                        
                        for(int y = a[x]; y <= b[x]; y++)
                            lines[y]++;
                    }

                    for(int x = 0; x <= MAX_A; x++)
                        if(lines[x] > 1)
                            overlap = true;
                    
                    if(overlap == false)
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}