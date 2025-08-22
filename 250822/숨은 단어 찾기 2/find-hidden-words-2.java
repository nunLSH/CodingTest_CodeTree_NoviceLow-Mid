import java.util.*;
public class Main {
    public static int n, m;
    public static int[] dx = {0, 0, -1, 1, -1, -1, 1, 1}; // 왼, 오, 위, 아래, 우상, 좌상, 우하, 좌하
    public static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                board[i][j] = sc.next().charAt(0);
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++){
            boolean isLEE = false;
            for (int j = 0; j < m; j++){
                if (board[i][j] == 'L'){
                   int nx = i, ny = j;

                    int k = 0; 
                    boolean isE = false;
                    while(board[nx][ny] != 'E' || k < 8) {
                        nx += dx[k];
                        ny += dy[k];

                        if (board[nx][ny] == 'E'){
                            isE = true;
                            break;
                        }
                        k++;
                    }
                    if (isE == true){
                        while(board[nx][ny] != 'E' || k < 8) {
                        nx += dx[k];
                        ny += dy[k];

                        if (board[nx][ny] == 'E'){
                            isLEE = true;
                            break;
                        }
                        k++;
                        }
                    }
                }
            }
            if (isLEE == true)
                cnt++;
        }
        System.out.print(cnt);
    }
}