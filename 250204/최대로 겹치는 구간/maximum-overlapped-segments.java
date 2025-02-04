import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[201];
        for (int i = 1; i <= n; i++){
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++){
                arr[j]++;
            }
        }
        int max = arr[1];
        for (int i = 1; i < 201; i++){
            if (max < arr[i])
                max = arr[i];
        }
        System.out.print(max);
    }
}