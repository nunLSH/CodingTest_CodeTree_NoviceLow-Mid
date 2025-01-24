import java.util.Scanner;
public class Main {
    public static int sumEven(int n){
        if (n == 1)
            return 0;
        
        if (n % 2 == 0)
            n /= 2;
        else
            n /= 3;

        return 1 + sumEven(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sumEven(n));
    }
}