import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num_people = new int[n+1];
        for (int i = 1; i <= n; i++){
            num_people[i] = sc.nextInt();
        }

        // 해설
        int minDis = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++){
            int sumDist = 0;
            for (int j = 1; j <= n; j++){
                int dist = (j + n - i) % n;
                sumDist += dist * num_people[j];
            }
               minDis = Math.min(minDis, sumDist);
        }
        System.out.println(minDis);

        // int minDis = Integer.MAX_VALUE;
        // for (int i = 1; i <= n; i++){
        //     int sumDis = 0;
        //     if (i == 1){
        //         for (int j = 1; j <= n; j++){
        //             sumDis += num_people[j] * Math.abs(j - i);
        //         }
        //     } else if (i == n) {
        //         for (int j = 1; j < n; j++){
        //             sumDis += num_people[j] * j;
        //         }
        //     } else {
        //         for (int j = i; j <= n; j++){
        //             sumDis += num_people[j] * Math.abs(j - i);
        //         }
        //         for (int j = 1; j < i; j++){
        //             sumDis += num_people[j] * Math.abs(n + j - i);
        //         }
        //     } 
        //     minDis = Math.min(minDis, sumDis);
        // }
        // System.out.println(minDis);
    }
}