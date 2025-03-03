import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();

        int cnt = 0;
        for (int i = 0; i < len - 1; i++)
            for (int j = i + 1; j < len; j++)
                if (a.charAt(i) == '(' && a.charAt(j) == ')')
                    cnt++;
            
        System.out.print(cnt);
    }
}