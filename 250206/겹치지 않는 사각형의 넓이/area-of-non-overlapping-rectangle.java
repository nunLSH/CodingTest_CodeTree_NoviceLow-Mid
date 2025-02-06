import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] square = new int[2000][2000];

        // A, B
        for (int i = 0; i < 2; i++){
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++){
                for (int h = y1; h < y2; h++)
                    square[j][h]++;
            }
        }

        // M
        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;

        for (int j = mx1; j < mx2; j++){
            for (int h = my1; h < my2; h++)
                square[j][h]--;
        }

        int area = 0;
        for (int i = 0; i < 2000; i++){
            for (int j = 0; j < 2000; j++){
                if (square[i][j] > 0)
                    area++;
            }
        }
        System.out.print(area);
    }
}