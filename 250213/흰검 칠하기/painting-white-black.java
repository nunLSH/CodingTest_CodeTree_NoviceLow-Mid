import java.util.Scanner;
public class Main {
    public static final int MAX = 1000 * 100;
    public static int[][] tiles = new int[3][2 * MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cur = MAX;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R') { // 검은색 1
                for (int j = cur; j < cur + x; j++){
                    tiles[1][j]++;
                    tiles[0][j] = 1;
                }
                cur = cur + x - 1;
            } else { // 흰색 2
                for (int j = cur; j > cur - x; j--){
                    tiles[2][j]++;
                    tiles[0][j] = 2;
                }
                cur = cur - x + 1;
            }
        }

        int cntW = 0, cntB = 0, cntG = 0;
        for (int i = 0; i < 2 * MAX; i++){
            if (tiles[1][i] >= 2 && tiles[2][i] >= 2) cntG++; // 회색
            else if (tiles[0][i] == 1) cntB++; // 검은색
            else if (tiles[0][i] == 2) cntW++; // 흰색
        }
        System.out.print(cntW+" "+cntB+" "+cntG);
    }
}
