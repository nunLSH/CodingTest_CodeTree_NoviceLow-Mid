import java.util.Scanner;

public class Main {
    public static int dx[] = new int[]{0, 1, -1, 0};
    public static int dy[] = new int[]{-1, 0, 0, 1};

    public static int n;

    public static boolean inRange(int x, int y) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }

    public static int getDir(String dir){
        if (dir.equals("U")) 
            return 0;
        else if (dir.equals("R"))
            return 1;
        else if (dir.equals("L"))
            return 2;
        else 
            return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        String d = sc.next();

        int dirNum = getDir(d);

        while (t-- > 0){
            int nx = c + dx[dirNum], ny = r + dy[dirNum];
                
            if (inRange(nx, ny)) {
                c += nx;
                r += ny
            } else 
                dirNum = 3 - dirNum;
        }

        System.out.print(r + " " + c);
    }
}