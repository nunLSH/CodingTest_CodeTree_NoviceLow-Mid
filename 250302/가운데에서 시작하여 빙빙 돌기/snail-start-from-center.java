import java.util.Scanner;

public class Main {
    public static final int MAX = 100;
    public static int n;
    public static int[][] arr = new int[MAX + 1][MAX + 1];

    public static int[] dx = new int[]{0, -1, 0, 1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int x, y, dir = 3;

    public static boolean inRange(int x, int y){
        return (0 < x && x <= n && 0 < y && y <= n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        x = n / 2 + 1;
        y = n / 2 + 1;
        arr[x][y] = 1;
        
        for (int i = 2; i <= n * n; i++){
            int ndir = (dir + 1) % 4;
            int nx = x + dx[ndir], ny = y + dy[ndir];

            if (inRange(nx, ny) && arr[nx][ny] == 0){
                x = nx;
                y = ny;
                dir = ndir;
            } else {
                x = x + dx[dir];
                y = y + dy[dir];
            }
            arr[x][y] = i;
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
}