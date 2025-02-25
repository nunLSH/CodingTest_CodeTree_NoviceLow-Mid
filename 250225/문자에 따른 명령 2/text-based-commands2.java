import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {0, 1, 0, -1}; // 북동남서
        int[] dy = {1, 0, -1, 0}; 

        int x = 0;
        int y = 0;

        String s = sc.next();
        int len = s.length();
        int dirNum = 0;

        for (int i = 0; i < len; i++){
            char dir = s.charAt(i);

            if (dir == 'L')
                dirNum = (dirNum + 3) % 4;
            else if (dir == 'R')
                dirNum = (dirNum + 1) % 4;
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }
        System.out.print(x + " " + y);
    }
}