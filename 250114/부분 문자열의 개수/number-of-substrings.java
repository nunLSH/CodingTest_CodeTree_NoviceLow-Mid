import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int len1 = a.length();

        int cnt = 0;

        for (int i = 0; i < len1 - 1; i++){
            if (a.substring(i, i+2).equals(b))
                cnt++;
        }
        System.out.print(cnt);
    }
}