import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = 40000;
    public static final int MIN = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] dots = new int[n][2];
        for (int i = 0; i < n; i++){
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int minExtent = MAX * MAX;
        for (int i = 0; i < n; i++){
            int minX = MAX, maxX = MIN, minY = MAX, maxY = MIN;
            for (int j = 0; j < n; j++){
                if (i == j)
                    continue;
                
                minX = Math.min(dots[j][0], minX);
                maxX = Math.max(dots[j][0], maxX);
                minY = Math.min(dots[j][1], minY);
                maxY = Math.max(dots[j][1], maxY);
            }
            int extent = (maxX - minX) * (maxY - minY);
            minExtent = Math.min(minExtent, extent);
        }
        System.out.print(minExtent);
    }
}