import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int maxSum = 0;
        for (int i = x; i <= y; i++){
            int sum = 0;
            
            int num = i;
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.print(maxSum);
    }
}