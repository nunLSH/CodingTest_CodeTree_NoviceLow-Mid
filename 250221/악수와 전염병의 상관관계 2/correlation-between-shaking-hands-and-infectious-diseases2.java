import java.util.Scanner;
import java.util.Arrays;

class Shake implements Comparable<Shake>{
    int time, person1, person2;

    public Shake(int time, int person1, int person2){
        this.time = time;
        this.person1 = person1;
        this.person2 = person2;
    }

    @Override
    public int compareTo(Shake shake) {
        return this.time - shake.time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] devs = new int[2][n+1]; // 개발자 배열 (0행:감염여부, 1행:감염 횟수)
        int k = sc.nextInt();
        int p = sc.nextInt();
        int t = sc.nextInt();
        Shake[] shake = new Shake[t];

        devs[0][p] = 1; // 감염된 개발자

        // 악수 정보 시간 순으로 정렬
        for (int i = 0; i < t; i++){
            int time = sc.nextInt();
            int person1 = sc.nextInt();
            int person2 = sc.nextInt();

            shake[i] = new Shake(time, person1, person2);
        }
        Arrays.sort(shake, 0, t);
        
        // 감염여부 판단
        for (int i = 0; i < t; i++){
            int target1 = shake[i].person1;
            int target2 = shake[i].person2;

            // 감염되어 있을 경우 악수 횟수 증가
            if (devs[0][target1] == 1)
                devs[1][target1]++;
            if (devs[0][target2] == 1)
                devs[1][target2]++;

            // target1이 감염되어 있고, k번 이하로 악수한 경우
            if (devs[0][target1] == 1 && devs[1][target1] <= k)
                devs[0][target2] = 1;
            // target2가 감염되어 있고, k번 이하로 악수한 경우
            if (devs[0][target2] == 1 && devs[1][target2] <= k)
                devs[0][target1] = 1;
        }
            
        // 감염여부 출력
        for (int i = 1; i < n+1; i++){
            System.out.print(devs[0][i]);
        }
    }
}