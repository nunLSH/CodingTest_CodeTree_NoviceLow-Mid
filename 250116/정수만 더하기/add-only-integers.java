import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                str += s.charAt(i);
        }
        for (int i = 0; i < str.length(); i++){
            sum += (str.charAt(i) - '0');
        }
        System.out.print(sum);
    }
}