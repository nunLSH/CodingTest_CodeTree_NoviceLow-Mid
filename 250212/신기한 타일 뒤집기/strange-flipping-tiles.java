import java.util.Scanner;
public class Main {
    public static final int MAX = 200000;
    public static int[] color = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cur = MAX / 2;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'L'){
                for (int j = cur; j > cur - x; j--)
                    color[j] = 1;
                cur = cur - x + 1;
            } else {
                for (int j = cur; j < cur + x; j++)
                    color[j] = 2;
                cur = cur + x - 1;
            }
        }

        int cntW = 0, cntB = 0;
        for (int i = 0; i < MAX; i++){
            if (color[i] == 1) cntW++;
            if (color[i] == 2) cntB++;
        }

        System.out.print(cntW + " " + cntB);
    }
}