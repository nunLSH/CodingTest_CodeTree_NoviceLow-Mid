import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = 100;
    public static int[] text = new int[MAX+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int maxPos = 0;
        for (int i = 0; i < n; i++){
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            maxPos = Math.max(maxPos, pos);
            text[pos] = c;
        }

        int sizeMax = 0;
        for (int i = 0; i <= maxPos; i++){
            for (int k = i+1; k <= maxPos; k++){
                // 시작점 i, 종료점 k

                if (text[i] == 0 || text[k] == 0)
                    continue;

                int gCnt = 0, hCnt = 0;    
                for (int j = i; j <= k; j++){ // 구간

                    if (text[j] == 'G') 
                        gCnt++;
                    else if (text[j] == 'H')
                        hCnt++;
                
                }

                if (gCnt == 0 || hCnt == 0 || gCnt == hCnt){
                    sizeMax = Math.max(k - i, sizeMax);
                }
            }
        }
        System.out.print(sizeMax);     
    }
}