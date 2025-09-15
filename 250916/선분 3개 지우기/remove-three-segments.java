
import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = 100;
    public static int[] lines = new int[MAX+1];
    public static int[] a = new int[10];
    public static int[] b = new int[10];

    public static boolean countLines(int x, int y, int z){
        for (int i = a[x]; i <= b[x]; i++) lines[i]--;
        for (int i = a[y]; i <= b[y]; i++) lines[i]--;
        for (int i = a[z]; i <= b[z]; i++) lines[i]--;
        
        for (int i = 0; i < MAX+1; i++){
            if (lines[i] > 1) {
                for (int j = a[x]; j <= b[x]; j++) lines[j]++;
                for (int j = a[y]; j <= b[y]; j++) lines[j]++;
                for (int j = a[z]; j <= b[z]; j++) lines[j]++;
                
                return false;
            }
        }

        for (int i = a[x]; i <= b[x]; i++) lines[i]++;
        for (int i = a[y]; i <= b[y]; i++) lines[i]++;
        for (int i = a[z]; i <= b[z]; i++) lines[i]++;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();

            for (int j = a[i]; j <= b[i]; j++)
                lines[j]++;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
            
                    if (countLines(i, j, k))
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}