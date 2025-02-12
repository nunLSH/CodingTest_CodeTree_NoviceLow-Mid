import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x1 = new int[2];
        int[] y1 = new int[2];
        int[] x2 = new int[2];
        int[] y2 = new int[2];

        int[][] square = new int[2001][2001];

        for(int i = 0; i < 2; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            
            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        for(int i = 0; i < 2; i++)
            for(int x = x1[i]; x < x2[i]; x++)
                for(int y = y1[i]; y < y2[i]; y++)
                    square[x][y] = i + 1;

        int minX = MAX_R, maxX = 0, minY = MAX_R, maxY = 0;
        boolean firstRectExist = false;

        for(int x = 0; x <= MAX_R; x++)
            for(int y = 0; y <= MAX_R; y++)
                if(square[x][y] == 1) {
                    firstRectExist = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
        
        int area = 0;

        if (!firstRectExist)
            area = 0;
        else
            area = (maxX - minX + 1) * (maxY - minY + 1);
        
        System.out.print(area);
    }
}