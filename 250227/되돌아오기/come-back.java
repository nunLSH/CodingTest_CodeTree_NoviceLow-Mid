import java.util.Scanner;
public class Main {
    public static int[] dx = new int[]{-1, 0, 0, 1};
    public static int[] dy = new int[]{0, -1, 1, 0};

    public static int x = 0, y = 0, dirNum = 0;
    public static int ans = -1, elapsedTime = 0;

    public static int getDir(char dir){
        if (dir == 'W')
            return 0;
        else if (dir == 'S')
            return 1;
        else if (dir == 'N')
            return 2;   
        else 
            return 3;
    }

    public static boolean move(int dir, int dist){
        while (dist-- > 0){
            x += dx[dirNum];
            y += dy[dirNum];
            elapsedTime++;

            if (x == 0 && y == 0){
                ans = elapsedTime;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            dirNum = getDir(dir);

            if (move(dir, dist))
                break;
        }
        System.out.print(ans);
    }
}