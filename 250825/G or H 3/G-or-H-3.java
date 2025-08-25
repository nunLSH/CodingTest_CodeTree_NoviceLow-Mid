import java.util.*;
public class Main {
    public static int n, k;
    public static final int MAX_NUM = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        char[] arr = new char[MAX_NUM+1];
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'G')
                arr[num] = 1;
            else
                arr[num] = 2;
        } 

        int maxSum = 0;
        for (int i = 1; i <= MAX_NUM-k; i++){
            int sum = 0;
            for (int j = i; j <= i+k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(sum, maxSum);
        }   
        System.out.print(maxSum);
    }
}