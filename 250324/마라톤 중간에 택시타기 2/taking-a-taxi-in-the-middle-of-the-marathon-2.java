import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] point = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            point[i][1] = sc.nextInt();
            point[i][2] = sc.nextInt();
        }

        int minDis = Integer.MAX_VALUE;
        for (int i = 2; i < n; i++){               
            int sumDis = 0; 
            int x = point[i][1], y = point[i][2];
            point[i][1] = point[i-1][1];
            point[i][2] = point[i-1][2];
            for (int j = 1; j < n; j++) {
                sumDis += (Math.abs(point[j][1] - point[j+1][1]) + Math.abs(point[j][2] - point[j+1][2]));
            }
            point[i][1] = x;
            point[i][2] = y;
            minDis = Math.min(sumDis, minDis);
        }
        System.out.print(minDis);
    }
}