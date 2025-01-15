import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        while (len != 1) {
            int n = sc.nextInt();

            if (n == 0) 
                str = str.substring(1);
            else if (n > 0 && n < len)
                str = str.substring(0, n)+str.substring(n+1);
            else if (n >= len)
                str = str.substring(0, len-1);

            len = str.length();
            System.out.println(str);
        }
    }
}