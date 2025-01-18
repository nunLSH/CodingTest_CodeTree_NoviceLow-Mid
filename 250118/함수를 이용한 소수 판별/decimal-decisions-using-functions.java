import java.util.Scanner;
public class Main {
    public static int primeSum(int a, int b){
        int sum = 0;

        for (int i = a; i <= b; i++){
            boolean isPrime = true;

            if (i == 1)
                isPrime = false;
                
            for (int k = 2; k < i; k++){
                if (i % k == 0)
                    isPrime = false;
            }
            if (isPrime == true)
                sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(primeSum(a, b));
    }
}