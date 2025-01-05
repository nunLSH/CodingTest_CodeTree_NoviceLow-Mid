import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];
        int[] cnt = new int[1001];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            cnt[array[i]]++;
        }

        int max = -1;

        for (int i = 0; i < 1000; i++){
            if (cnt[i] == 1) {
                if (cnt[i] > max)
                    max = i;
            }
        }

        System.out.print(max);
    }
}