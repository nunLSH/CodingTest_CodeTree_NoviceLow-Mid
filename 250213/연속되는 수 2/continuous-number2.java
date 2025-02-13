import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxCnt = 0, cnt = 1;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (i >= 1 && arr[i] == arr[i-1]) {
                cnt++;
            } else 
                cnt = 1;
            
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.print(maxCnt);
    }
}