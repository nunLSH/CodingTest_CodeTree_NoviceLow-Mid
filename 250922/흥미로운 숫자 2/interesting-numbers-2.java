import java.util.*;
public class Main {
    public static int x, y;

    public static boolean isInterestingNum (int num){
        int[] rCnt = new int[10];
        int allDigits = 0;
        while (num > 0){
            rCnt[num % 10]++;
            allDigits++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++){
            if (rCnt[i] == allDigits - 1)
                return true;
        }

        return false;
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