import java.util.Scanner;
public class Main {
    public static int numN(int n){
        if (n == 1 || n == 2)
            return n;
        return numN (n / 3) + numN(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(numN(n));
    }
}