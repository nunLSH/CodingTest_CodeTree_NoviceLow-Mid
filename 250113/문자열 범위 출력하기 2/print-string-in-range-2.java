import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        int len = str.length();

        if (n <= len) {
            for (int i = len-1; i >= len - n; i--)
                System.out.print(str.charAt(i));
        } else {
            for (int i = len-1; i >= 0; i--)
                System.out.print(str.charAt(i));
        }
    }
}