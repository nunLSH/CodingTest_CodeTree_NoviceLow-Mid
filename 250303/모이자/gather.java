import java.util.Scanner;
public class Main {
    public static int n;
    public static final int MAX = 100 * 100;
    public static int[] home = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int a = sc.nextInt();
            home[i] = a;
        }

        int minDis = MAX;
        for (int i = 1; i <= n; i++){
            int sumDis = 0;

            for (int j = 1; j <= n; j++){
                sumDis += Math.abs((j - i) * home[j]);
            }

            if (sumDis < minDis)
                minDis = sumDis;
        }
        System.out.print(minDis);
    }
}