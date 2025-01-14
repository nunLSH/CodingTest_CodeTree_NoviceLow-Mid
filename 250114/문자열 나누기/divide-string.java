import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        String s = "";

        for (int i = 0; i < n; i++){
            str[i] = sc.next();
            s += str[i];
        }

        int cnt = 0;
        for (int i = 0; i < s.length(); i++){
            if ((i+1) % 5 == 0)
                System.out.println();
            System.out.print(s.charAt(i));
        }
    }
}