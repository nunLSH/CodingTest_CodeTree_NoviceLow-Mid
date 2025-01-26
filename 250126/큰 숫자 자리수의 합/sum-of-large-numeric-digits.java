import java.util.Scanner;
public class Main {
    public static int countSum(int n){
        if (n == 0)
            return 0;
        
        return n % 10 + countSum(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print(countSum(num1 * num2 * num3));
    }
}