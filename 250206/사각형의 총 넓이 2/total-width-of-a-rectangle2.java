import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] square = new int[200][200];

        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int k = x1; k < x2; k++){
                for (int j = y1; j < y2; j++)
                    square[k][j]++;
            }
        }
        
        int area = 0;
        for (int i = 0; i < 200; i++){
            for (int j = 0; j < 200; j++){
                if (square[i][j] == 1 || square[i][j] == 2)
                    area++;
            }
        }
        System.out.print(area);
    }
}