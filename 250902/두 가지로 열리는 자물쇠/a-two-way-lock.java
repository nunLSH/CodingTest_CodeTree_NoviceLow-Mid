import java.util.*;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] fir = new int[3];
        int[] sec = new int[3];
        for (int i = 0; i < 3; i++)
            fir[i] = sc.nextInt();
        for (int i = 0; i < 3; i++)
            sec[i] = sc.nextInt();
    
        // 첫번째 조합
        int[] cntFir = new int[3];
        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= n; j++){
                int diff = Math.abs (j - fir[i]);

                diff = Math.min(diff, n - diff);

                if (diff <= 2)
                    cntFir[i]++;
            }
        }

        // 두번째 조합
        int[] cntSec = new int[3];
        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= n; j++){
                int diff = Math.abs (j - sec[i]);

                diff = Math.min(diff, n - diff);

                if (diff <= 2)
                    cntSec[i]++;
            }
        }

        // 공통 조합
        int[] cntCom = new int[3];
        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= n; j++){
                int diff1 = Math.abs (j - fir[i]);
                int diff2 = Math.abs (j - sec[i]);

                diff1 = Math.min(diff1, n - diff1);
                diff2 = Math.min(diff2, n - diff2);
                
                if (diff1 <= 2 && diff2 <= 2)
                    cntCom[i]++;
            }
        }

        int cntFirst = 1, cntSecond = 1, cntCommon = 1;
        for (int i = 0; i < 3; i++){
            cntFirst *= cntFir[i];
            cntSecond *= cntSec[i];
            cntCommon *= cntCom[i];
        }

        System.out.print(cntFirst + cntSecond - cntCommon);
    }
}