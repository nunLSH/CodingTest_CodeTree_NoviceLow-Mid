import java.util.Scanner;
public class Main {
    public static boolean inRange(int n, int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int cnt = 0;
                for (int dirNum = 0; dirNum < 4; dirNum++){
                    int nx = i + dx[dirNum];
                    int ny = j + dy[dirNum];

                    if (inRange(n, nx, ny) && arr[nx][ny] == 1)
                        cnt++;
                }
                if (cnt >= 3)
                    ans++;
            }
        }
        System.out.print(ans);
    }
}