import java.util.*;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] dots = new int[n][2];
        for (int i = 0; i < n; i++){
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int maxDoubleExtent = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    int width = Math.abs(dots[i][0] - dots[j][0]);
                    int height = Math.abs(dots[j][1] - dots[k][1]);

                    if (dots[i][1] - dots[j][1] == 0){
                        if (dots[j][0] - dots[k][0] == 0){
                            maxDoubleExtent = Math.max(maxDoubleExtent, width * height);
                        }
                    }
                }
            }
        }

        System.out.print(maxDoubleExtent);
    }
}