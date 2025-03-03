import java.util.Scanner;

public class Main {
    public static final int MAX = 99;
    public static int n;

    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int x, y, dir = 3;

    public static void getDir(int cmd){
        if (cmd == 'L')
            dir = (dir + 3) % 4;
        else if (cmd == 'R')
            dir = (dir + 1) % 4;
    }

    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();

        // 격자 채우기
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        x = n / 2;
        y = n / 2;
        int sum = board[x][y];
        // 명령에 따라 움직이기
        for (int i = 0; i < t; i++){
            char cmd = commands.charAt(i);
            getDir(cmd);

            if (cmd == 'F') {
                int nx = x + dx[dir], ny = y + dy[dir];
                if (inRange(nx, ny)){
                    x = nx;
                    y = ny;
                    sum += board[x][y];
                }
            }
        }

        System.out.print(sum);
    }
}