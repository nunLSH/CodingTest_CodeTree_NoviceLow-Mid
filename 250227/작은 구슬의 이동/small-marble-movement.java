import java.util.Scanner;

public class Main {
    public static int dx[] = new int[]{0, 1, -1, 0};
    public static int dy[] = new int[]{-1, 0, 0, 1};

    public static int n;

    public static boolean inRange(int x, int y) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }

    public static int getDir(int dir){
        if (D.equals("U")) 
            return 0;
        else if (D.equals("R"))
            return 1;
        else if (D.equals("L"))
            return 2;
        else 
            return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();

        int dirNum = getDir(D);

        while (t-- > 0){
            int nx = C + dx[dirNum], ny = R + dy[dirNum];
                
            if (inRange(nx, ny)) {
                C += nx;
                R += ny
            } else 
                dirNum = 3 - dirNum;
        }

        System.out.print(R + " " + C);
    }
}