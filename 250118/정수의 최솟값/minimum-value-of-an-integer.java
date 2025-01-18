import java.util.Scanner;
public class Main {
    public static int findMin(int a, int b, int c){
        int min = 0;

        if (a > b && c > b )
            min = b;
        else if (a > c && b > c)
            min = c;
        else 
            min = a;

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