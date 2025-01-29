import java.util.Scanner;
public class Main {
    public static int num;
    public static int[] arr = new int[11];
    public static int gcd = 1, lcm = 1;

    public static int gcd(int n) {
        for (int i = 1; i <= 10; i++) {
            if (arr[n] % i == 0 && lcm % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int lcm(int n){
        if (n == 1) {
            lcm = arr[1];                   
            return lcm;
        }

        lcm = arr[n] * lcm(n-1) / gcd(n);

        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(lcm(num));
    }
}