import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] square = new int[200][200];

        for (int i = 0; i < n; i++){
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            for (int j = x; j < x+8; j++){
                for (int k = y; k < y+8; k++)
                    square[j][k]++;
            }
        }

        int area = 0;
        for (int i = 0; i < 200; i++){
            for (int j = 0; j < 200; j++){
                if (square[i][j] > 0)
                    area++;
            }
        }
        System.out.print(area);
    }
}