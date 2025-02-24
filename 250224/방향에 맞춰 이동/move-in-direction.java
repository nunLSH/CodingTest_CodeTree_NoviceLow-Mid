import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int[] dx = {-1, 0, 0, 1}; // 서남북동
        int[] dy = {0, -1, 1, 0}; // 서남북동


        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            for (int k = 0; k < dis; k++){
                if (dir == 'W'){
                    x += dx[0]; 
                    y += dy[0];
                } else if (dir == 'S'){
                    x += dx[1]; 
                    y += dy[1];
                } else if (dir == 'N'){
                    x += dx[2]; 
                    y += dy[2];
                } else {
                    x += dx[3]; 
                    y += dy[3];
                }
            }
        }

        System.out.print(x + " " + y);
    }
}