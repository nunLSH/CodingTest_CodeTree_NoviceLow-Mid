import java.util.Scanner;
public class Main {
    public static void maxCommonDivisor(int n, int m){
        int maxCommonDivisor = 0;
        for (int i = 1; i <= 100; i++){
            if (n % i == 0 && m % i == 0){
                maxCommonDivisor = i;
            }
        }
        System.out.print(maxCommonDivisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        maxCommonDivisor(n, m);
    }
}