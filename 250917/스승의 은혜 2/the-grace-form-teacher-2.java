import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++)
            p[i] = sc.nextInt();
        
        int maxCnt = 0;
        for (int i = 0; i < n; i++){ // 할인 받을 학생
            int[] price = new int[n];
            for (int j = 0; j < n; j++){
                if (i == j)
                    price[j] = p[j] / 2;
                else 
                    price[j] = p[j];
            }

            Arrays.sort(price);
            
            int sum = 0, cnt = 0;
            for (int k = 0; k < n; k++){
                sum += price[k];

                if (sum > b)
                    break;
                else 
                    cnt++;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.print(maxCnt);
    }
}