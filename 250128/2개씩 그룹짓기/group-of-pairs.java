import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n, max;
    public static int[] arr = new int[2000];

    public static int max() {
        for (int i = 1; i < n; i ++) {
            if (arr[i]+arr[2*n - 1 - i] > max)
                max = arr[i] + arr[2*n - 1 - i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < 2*n; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr, 0, 2*n);
        max = arr[0]+arr[2*n-1];

        System.out.print(max());
    }
}