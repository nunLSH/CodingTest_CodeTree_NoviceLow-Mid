import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] blocks = new int[n+1];
        for (int i = 1; i <= k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++){
                blocks[j]++;
            }
        }

        int max = blocks[1];
        for (int i = 2; i <= n; i++){
            if (max < blocks[i])
                max = blocks[i];
        }
        System.out.print(max);
    }
}