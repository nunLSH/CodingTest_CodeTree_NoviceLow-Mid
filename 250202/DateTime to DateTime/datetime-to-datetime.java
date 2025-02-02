import java.util.Scanner;
public class Main {
    public static int totalMin(int d, int h, int m){
        int totalMin = 0;

        totalMin = d * 24 * 60 + h * 60 + m;

        return totalMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(totalMin(a, b, c) - totalMin(11, 11, 11));
    }
}