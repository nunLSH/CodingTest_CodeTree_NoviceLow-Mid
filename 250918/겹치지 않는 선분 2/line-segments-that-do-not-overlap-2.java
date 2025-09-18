import java.util.*;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++){ // 선분 하나 선택
            boolean isOverlap = false;
            for (int j = 0; j < n; j++){ // 또 다른 선분 하나 선택
                if (i == j) continue;
                
                if ((x1[i] < x1[j] && x2[j] < x2[i]) || (x1[i] > x1[j] && x2[j] > x2[i])){
                    isOverlap = true;
                    break;
                }
            }
            if (!isOverlap)
                cnt++;
        }
        System.out.print(cnt);
    }
}