import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] square = new int[2000][2000];

        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;
        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;

        int x21 = sc.nextInt() + OFFSET;
        int y21 = sc.nextInt() + OFFSET;
        int x22 = sc.nextInt() + OFFSET;
        int y22 = sc.nextInt() + OFFSET;

        for (int j = x1; j < x2; j++){
            for (int k = y1; k < y2; k++)
                square[j][k]++;
        }

        for (int j = x21; j < x22; j++){
            for (int k = y21; k < y22; k++)
                square[j][k] = 2;
        }

        // 가로
        int width = 0;
        for (int i = y1; i < y2; i++){
            int cnt = 0;
            for (int j = x1; j < x2; j++){
                if (square[j][i] == 1){
                    cnt++;
                }
            }
            if (width < cnt)
                width = cnt;
        }
        // 세로
        int height = 0;
        for (int i = x1; i < x2; i++){
            int cnt = 0;
            for (int j = y1; j < y2; j++){
                if (square[i][j] == 1){
                    cnt++;
                }
            }
            if (height < cnt)
                height = cnt;
        }

        System.out.print(width * height);
    }
}