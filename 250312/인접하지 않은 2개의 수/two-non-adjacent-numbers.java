import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        
        int ans = num[0] + num[2];
        for (int i = 1; i < n-2; i++){
            for (int j = i+2; j < n; j++){
                int sum = num[i] + num[j];
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}