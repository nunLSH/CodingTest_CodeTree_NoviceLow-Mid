import java.util.Scanner;
public class Main {
    public static final int OS = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] area = new int[200][200];

        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt() + OS;
            int y1 = sc.nextInt() + OS;
            int x2 = sc.nextInt() + OS;
            int y2 = sc.nextInt() + OS;

            if (i % 2 == 0) {
                for (int j = x1; j < x2; j++){
                    for (int k = y1; k < y2; k++){
                        area[j][k] = 1;
                    }
                }
            }

            if (i % 2 != 0) {
                for (int j = x1; j < x2; j++){
                    for (int k = y1; k < y2; k++){
                        area[j][k] = 2;
                    }
                }
            }
        }
        
        int cnt = 0;
        for (int i = 0; i < 200; i++){
            for (int j = 0; j < 200; j++){
                if (area[i][j] == 2)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}