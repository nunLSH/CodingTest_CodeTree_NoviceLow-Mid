import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] dots = new int[n][2];
        for (int i = 0; i < n; i++){
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int minSqDis = MAX;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                
                int dis = (dots[i][0] - dots[j][0]) * (dots[i][0] - dots[j][0]) 
                        + (dots[i][1] - dots[j][1]) * (dots[i][1] - dots[j][1]);

                minSqDis = Math.min(dis, minSqDis);
            }
        }
        System.out.print(minSqDis);
    }
}