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

        int minDiff = arr[0] + arr[1];
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int diff = s - (arr[i] + arr[j]);
                minDiff = Math.abs(Math.min(minDiff, diff));
            }
        }
        System.out.println(minDiff);

    }
}