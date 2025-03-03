import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++)
            height[i] = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (i < j && j < k && height[i] <= height[j] && height[j] <= height[k])
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}