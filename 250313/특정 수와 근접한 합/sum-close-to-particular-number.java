import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int minDiff = Math.abs(sum - (arr[0] + arr[1]) - s);
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int diff = Math.abs(s - (sum - (arr[i] + arr[j])));
                minDiff = Math.min(minDiff, diff);
            }
        }
        System.out.println(minDiff);

    }
}