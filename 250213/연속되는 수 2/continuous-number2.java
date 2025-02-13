import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxCnt = 0, cnt = 1;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (i == 0 || arr[i] != arr[i-1]) {
                cnt = 1;
            } else if (arr[i] == arr[i-1])
                cnt++;
            
            if (cnt > maxCnt)
                maxCnt = cnt;
        }
        System.out.print(maxCnt);
    }
}