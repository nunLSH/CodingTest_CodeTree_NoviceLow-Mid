import java.util.Scanner;
public class Main {
    public static int n, m, dir = 0;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, 1, 0, -1};

    public static int[][] arr = new int[101][101];
    public static int x = 1, y = 1;

    public static boolean inRange(int x, int y){
        return (0 < x && x <= n && 0 < y && y <= m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr[x][y] = 1;
        
        for (int i = 2; i <= n * m; i++){
            int nx = x + dx[dir], ny = y + dy[dir];

            if (inRange(nx, ny) && arr[nx][ny] == 0){
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4;
                x = x + dx[dir];
                y = y + dy[dir];
            }
            arr[x][y] = i;
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
}