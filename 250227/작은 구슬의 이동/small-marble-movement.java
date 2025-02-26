import java.util.Scanner;

public class Main {
    public static int dx[] = new int[]{0, 1, -1, 0};
    public static int dy[] = new int[]{-1, 0, 0, 1};

    public static int N;

    public static boolean inRange(int x, int y) {
        return (1 <= x && x <= N && 1 <= y && y <= N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();

        int dirNum;

        if (D.equals("U")) 
            dirNum = 0;
        else if (D.equals("R"))
            dirNum = 1;
        else if (D.equals("L"))
            dirNum = 2;
        else 
            dirNum = 3;

        for (int i = 0; i < T; i++){
            int nx = C + dx[dirNum], ny = R + dy[dirNum];
                
            if (inRange(nx, ny)) {
                C += dx[dirNum];
                R += dy[dirNum];
            } else if (!inRange(nx, ny))
                dirNum = 3 - dirNum;
        }
        System.out.print(R + " " + C);
    }
}