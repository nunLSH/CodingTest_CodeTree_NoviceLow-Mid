import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static int x = 0, y = 0, dir = 0;

    public static int elaspedTime = 0, ans = -1;

    public static int getDir(char d){
        if (d == 'L')
            return (dir + 3) % 4;
        else if (d == 'R')
            return (dir + 1) % 4;
        else 
            return dir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int n = commands.length();

        for (int i = 0; i < n; i++){
            char d = commands.charAt(i);

            if (d == 'L')
                dir = (dir + 3) % 4;
            else if (d == 'R')
                dir = (dir + 1) % 4;
            else {
                x += dx[dir];
                y += dy[dir];
            }
            elaspedTime++;

            if (x == 0 && y == 0){
                ans = elaspedTime;
                break;
            }
        }

        System.out.print(ans);
    }
}