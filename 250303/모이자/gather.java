import java.util.Scanner;
public class Main {
    public static int n;
    public static final int MAX = Integer.MAX_VALUE;
    public static int[] a = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        
        int minDis = MAX;
        for (int i = 1; i <= n; i++){
            int sumDis = 0;

            for (int j = 1; j <= n; j++){
                sumDis += Math.abs((j - i) * a[j]);
            }

            minDis = Math.min(minDis, sumDis);
        }
        System.out.print(minDis);
    }
}