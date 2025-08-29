import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int maxPos = 0;
        int[] text = new int[100+1];
        for (int i = 0; i < n; i++){
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            maxPos = Math.max(maxPos, pos);
            text[pos] = c;
        }

        int sizeMax = 0;
        for (int i = 0; i < maxPos; i++){ // 크기
            for (int k = 1; k < maxPos+1 - i; k++){ // 시작점
                int gCnt = 0, hCnt = 0, min = MAX, max = 0;
                for (int j = k; j <= k + i; j++){ // 구간

                    if (text[j] == 'G') {
                        gCnt++;
                        min = Math.min(min, j);
                        max = Math.max(max, j);
                    }
                    else if (text[j] == 'H'){
                        hCnt++;
                        min = Math.min(min, j);
                        max = Math.max(max, j);
                    }
                }
                if (gCnt == 0 && hCnt > 0 || hCnt == 0 && gCnt > 0 || gCnt == hCnt){
                    sizeMax = Math.max(max - min, sizeMax);
                }
            }
        }
        System.out.print(sizeMax);     
    }
}