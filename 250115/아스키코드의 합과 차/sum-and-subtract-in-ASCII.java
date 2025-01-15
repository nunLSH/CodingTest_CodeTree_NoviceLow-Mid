import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = (int)sc.next().charAt(0);
        int b = (int)sc.next().charAt(0);

        System.out.print(a+b+" ");
        if (a > b)
            System.out.print(a-b);
        else
            System.out.print(b-a);
    }
}