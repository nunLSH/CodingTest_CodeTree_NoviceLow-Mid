import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ability = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i ++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        int diffMin = 1000;
        boolean isPossible = false;
        for (int i = 0; i < 5; i++){ // 1명
            int sumMax = ability[i], sumMin = ability[i];
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < 5; j++){
                for (int k = j+1; k < 5; k++){ // 2명
                    if (i == j || i == k || j == k){
                        continue;
                    }

                    sum1 = ability[j] + ability[k];
                    sum2 = total - ability[i] - sum1;

                    if (sum1 == sum2 || sum1 == ability[i] || sum2 == ability[i]){
                        continue;
                    }

                    isPossible = true;
                    
                    if (sum1 > sum2){
                        sumMax = Math.max(sum1, sumMax);
                        sumMin = Math.min(sumMin, sum2);
                    } else {
                        sumMax = Math.max(sum2, sumMax);
                        sumMin = Math.min(sumMin, sum1);
                    }
                    diffMin = Math.min(sumMax - sumMin, diffMin);
                }
            }
        }

        if (isPossible == false)
            System.out.print(-1);
        else
            System.out.print(diffMin);
    }
}