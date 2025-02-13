import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int maxCnt = 0, cnt = 1;

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();

            if (nums[i] < 0)
                nums[i] = 0;
            else
                nums[i] = 1;

            if (i >= 1 && nums[i] == nums[i-1])
                cnt++;
            else
                cnt = 1;

            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.print(maxCnt);
    }
}