import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int cnt = 0, sum = 0;

        for (int i = 0; i < 10; i++){
            num[i] = sc.nextInt();
            
            if (num[i] == 0){
                break;
            }
            cnt++;
            sum += num[i];
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}