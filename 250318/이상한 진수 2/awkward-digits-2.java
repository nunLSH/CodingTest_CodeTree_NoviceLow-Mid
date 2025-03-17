import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();
        int max = 0;

        for (int i = 0; i < len; i++){
            String newA = "";
            newA = a.substring(0, i) + (char)('0' + '1' - a.charAt(i)) + a.substring(i + 1);

            int n = 0;
            for (int j = 0; j < (int) newA.length(); j++)
                n = n * 2 + (newA.charAt(j) - '0');

            max = Math.max(n, max);
        }
        System.out.println(max);
    }
}