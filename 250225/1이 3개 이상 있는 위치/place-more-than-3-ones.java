import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100;
    public static final int DIR_NUM = 4;

    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {1, -1, 0, 0};

    public static boolean inRange(int n, int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static int adjacentCnt(int x, int y){
        int cnt = 0;
            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (inRange(n, nx, ny) && arr[nx][ny] == 1)
                    cnt++;
            }
        
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
            
                if (adjacentCnt(i, j) >= 3)
                    ans++;
            }
        }
        System.out.print(ans);
    }
}