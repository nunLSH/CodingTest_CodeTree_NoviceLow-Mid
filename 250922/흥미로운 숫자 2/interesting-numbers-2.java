import java.util.*;
public class Main {
    public static int x, y;

    public static boolean isInterestingNum (int num){
        int[] rCnt = new int[10];
        while (num > 0){
            int r = num % 10;
            rCnt[r]++;
            num /= 10;
        }
        Arrays.sort(rCnt);

        return countRemains(rCnt);
    }

    public static boolean countRemains(int[] arr){
        int len = 0;
        int init = 9;
        for (int i = 0; i < 10; i++){
            if (arr[i] > 0){
                len++;
                init = Math.min(i, init);
            }
        }

        if (len != 2)
            return false;
        
        if (arr[init] != 1)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = 0;
        for (int i = x; i <= y; i++){
            if (isInterestingNum(i))
                ans++;
        }
        System.out.print(ans);
    }
}