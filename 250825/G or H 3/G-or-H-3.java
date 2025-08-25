import java.util.*;
public class Main {
    public static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        char[] arr = new char[10001];
        int maxNum = 0;
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            char c = sc.next().charAt(0);
            maxNum = Math.max(num, maxNum);

            arr[num] = c;
        } 

        int max = 0;
        for (int i = 1; i <= maxNum-k; i++){
            int sum = 0;
            for (int j = i; j <= i+k; j++){
                if (arr[j] == 'G')
                    sum += 1;
                else if (arr[j] == 'H')
                    sum += 2;
            }
            max = Math.max(sum, max);
        }   
        System.out.print(max);
    }
}