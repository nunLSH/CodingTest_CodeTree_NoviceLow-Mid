import java.util.Scanner;
public class Main {
    // public static final int MAX = 100 * 10 * 2;

    public static int[] dx = new int[]{-1, 0, 0, 1};
    public static int[] dy = new int[]{0, -1, 1, 0};

    public static int x = 0, y = 0, t = -1, distance = 0;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            int dirNum = getDir(dir);

            for (int j = 0; j < dist; j++){
                x += dx[dirNum];
                y += dy[dirNum];
                distance++;

                if (x == 0 && y == 0){
                    t = distance;
                    break;
                }
            }

            if (t == distance)
                break;
        }
        System.out.print(t);
    }
}