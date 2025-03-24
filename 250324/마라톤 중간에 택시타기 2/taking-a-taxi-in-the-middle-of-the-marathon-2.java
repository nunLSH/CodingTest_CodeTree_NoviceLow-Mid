import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minDis = Integer.MAX_VALUE;
        for (int i = 2; i < n; i++){               
            int sumDis = 0; 
            int prevIndex = 0;
            for (int j = 2; j <= n; j++) {
                if (j == i) continue;
                sumDis += Math.abs(x[prevIndex] - x[j]) + Math.abs(y[prevIndex] - y[j]);
                prevIndex = j;
            }
            minDis = Math.min(sumDis, minDis);
        }
        System.out.print(minDis);
    }
}