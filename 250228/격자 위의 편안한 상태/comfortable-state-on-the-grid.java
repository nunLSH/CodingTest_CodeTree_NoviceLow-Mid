import java.util.Scanner;
public class Main {
    public static final int MAX = 100;
    public static int[][] arr = new int[MAX+1][MAX+1];
    public static int n;

    public static int[] dx = new int[]{-1, 1, 0, 0};
    public static int[] dy = new int[]{0, 0, 1, -1};

    public static boolean inRange(int nx, int ny) {
        return(1 <= nx && nx <= n && 1 <= ny && ny <= n);
    }

    public static boolean isComf(int x, int y){
        int cnt = 0;
        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (inRange(nx, ny) && arr[nx][ny] == 1)
                cnt++;
        }

        if (cnt == 3)
            return true;
 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r][c] = 1;

            if (isComf(r, c))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}