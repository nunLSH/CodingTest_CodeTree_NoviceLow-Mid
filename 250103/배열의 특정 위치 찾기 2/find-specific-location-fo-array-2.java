import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int sum_odd = 0, sum_even = 0;

        for (int i = 0; i < 10; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i += 2){
            sum_odd += num[i];
            sum_even += num[i+1];
        }

        if (sum_even >= sum_odd)
            System.out.print(sum_even - sum_odd);
        else
            System.out.print(sum_odd - sum_even);
    }
}