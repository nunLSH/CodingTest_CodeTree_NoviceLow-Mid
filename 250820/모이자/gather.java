import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] p = new int[100];
    public static final int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            p[i] = sc.nextInt();
        
        int minDis = MIN;
        for (int i = 0; i < n; i++) {
            int sumDis = 0;

            for (int j = 0; j < n; j++) {
                sumDis += p[j] * Math.abs(i-j);
            }

            minDis = Math.min(sumDis, minDis);
        }
        System.out.print(minDis);
    }
}