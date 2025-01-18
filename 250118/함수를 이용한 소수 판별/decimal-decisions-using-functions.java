import java.util.Scanner;
public class Main {
    public static int isPrime(int n){

            if (n == 1)
                return false;
                
            for (int k = 2; k < n; k++){
                if (n % k == 0)
                    return false;
            }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++){
            if (isPrime(i))
                sum += i;
        }
        System.out.print(sum);
    }
}