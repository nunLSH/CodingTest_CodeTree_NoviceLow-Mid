import java.util.Scanner;
public class Main {
    public static final int MAX = 100;
    public static char[][] arr = new char[MAX+1][MAX+1];

    public static int n, m;

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int x = 1, y = 1, dir = 0;
    public static char c = 'A';

    public static boolean inRange(int x, int y){
        return (0 < x && x <= n && 0 < y && y <= m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr[x][y] = c;
        
        for (int i = 1; i < n * m; i++){
            int nx = x + dx[dir], ny = y + dy[dir];

            if (inRange(nx, ny) && arr[nx][ny] == 0){
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4;
                x = x + dx[dir];
                y = y + dy[dir];
            }
            
            arr[x][y] = ++c;

            if (arr[x][y] == 'Z')
                c = 'A';
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
    }
}