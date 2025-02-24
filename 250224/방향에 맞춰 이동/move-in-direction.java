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

            int dirNum;

    
            if (dir == 'W') dirNum = 0;
            else if (dir == 'S') dirNum = 1;
            else if (dir == 'N') dirNum = 2;
            else dirNum = 3;

            x += dx[dirNum] * dis;
            y += dy[dirNum] * dis;
        }

        System.out.print(x + " " + y);
    }
}