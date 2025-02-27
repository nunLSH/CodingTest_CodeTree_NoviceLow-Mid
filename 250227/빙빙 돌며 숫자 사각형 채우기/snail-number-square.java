import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[][] num = new int[101][101];

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int dirNum = 0;

    public static boolean inRange(int x, int y) {
        return (1 <= x && x <= n && 1 <= y && y <= m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int x = 1, y = 1;

        num[x][y] = 1;
        
        for (int i = 2; i <= n * m; i++){
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if (!inRange(nx, ny) || num[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;
    
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            num[x][y] = i;
        }

        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < m+1; j++)
                System.out.print(num[i][j]+" ");
            System.out.println();
        }
    }
}