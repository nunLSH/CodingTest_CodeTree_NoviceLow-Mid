import java.util.Scanner;
public class Main {
    public static int findMin(int a, int b, int c){
        int min = a;

        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(findMin(a, b, c));
    }
}