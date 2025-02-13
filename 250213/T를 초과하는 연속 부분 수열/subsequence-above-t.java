import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] nums = new int[n];

        int maxCnt = 0, cnt = 0;

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();

            if (nums[i] > t)
                cnt++;
            else 
                cnt = 0;
            
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.print(maxCnt);
    }
}