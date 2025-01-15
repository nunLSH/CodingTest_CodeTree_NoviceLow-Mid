import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        while (len > 1) {
            int n = sc.nextInt();

      
            if (n >= len)
                n = len -1;

            str = str.substring(0, n)+str.substring(n+1);
            len--;

            System.out.println(str);
        }
    }
}