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

        if (x21 <= x1 && y21 <= y1 && x2 <= x22 & y2 <= y22)
            System.out.print(0);
        else {
            for (int i = x1; i < x2; i++){
                for (int j = y1; j < y2; j++)
                    square[i][j]++;
            }

            for (int i = x21; i < x22; i++){
                for (int j = y21; j < y22; j++)
                    square[i][j] = 2;
            }

            int minx = 0, miny = 0, cnt = 0;

            for (int i = x1; i < x2; i++){
                for (int j = y1; j < y2; j++){
                    if (square[i][j] == 1){
                        minx = i;
                        miny = j;
                        cnt = 1;
                        break;
                    }
                }
                if (cnt == 1)
                    break;
            }

            int maxx = minx, maxy = miny;

            for (int i = x1; i < x2; i++){
                for (int j = y1; j < y2; j++){
                    if (square[i][j] == 1){
                        if (maxx < i)
                            maxx = i;
                        if (maxy < j)
                            maxy = j;
                    }
                }
            }
            int width = maxx - minx + 1;
            int height = maxy - miny + 1;
        
            System.out.print(width * height);
        }
    }
}