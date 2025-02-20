import java.util.Scanner;
import java.util.Arrays;

class Intro implements Comparable<Intro>{
    int time, x, y;

    public Intro(int time, int x, int y){
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Intro intro) {
        return this.time - intro.time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] devs = new int[2][n+1]; // 개발자 배열 (0:감염여부, 1:악수 횟수)
        int k = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();
        Intro[] intro = new Intro[t];

        devs[0][p] = 1; // 감염된 개발자

        // 악수 정보 시간 순으로 정렬
        for (int i = 0; i < t; i++){
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            intro[i] = new Intro(time, x, y);
        }
        Arrays.sort(intro);
        
        // 감염여부 판단
        for (int i = 0; i < t; i++){
            int xDevs = intro[i].x;
            int yDevs = intro[i].y;
            // x나 y가 감염된 개발자이면서 감염 가능한 악수횟수도 남아있을 경우
            if ((devs[0][xDevs] == 1 && devs[1][xDevs] < k) || (devs[0][yDevs] == 1 && devs[1][yDevs] < k)) {
                devs[0][xDevs] = 1;
                devs[0][yDevs] = 1;
                devs[1][xDevs]++; // 악수횟수 중가
                devs[1][yDevs]++;
            } else { // 감염 불가능
                devs[1][xDevs]++;
                devs[1][yDevs]++;
            }
        }

        // 감염여부 출력
        for (int i = 1; i < n+1; i++){
            System.out.print(devs[0][i]);
        }
    }
}