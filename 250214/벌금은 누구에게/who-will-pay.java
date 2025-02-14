import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalty = new int[n+1];
        int penaltyNum = -1;

        for (int i = 0; i < m; i++){
            int num = sc.nextInt();

            penalty[num]++;

            if (penalty[num] >= k) {
                penaltyNum = num;
                break;
            }
        }
        System.out.print(penaltyNum);
    }
}