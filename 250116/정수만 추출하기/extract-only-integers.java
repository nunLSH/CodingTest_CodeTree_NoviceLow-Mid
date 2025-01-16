import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String s_1 = "";
        String s_2 = "";

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
                s_1 += s1.charAt(i);
            else
                break;
        }

        for (int i = 0; i < s2.length(); i++){
            if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9')
                s_2 += s2.charAt(i);
            else
                break;
        }
        System.out.print(Integer.parseInt(s_1)+Integer.parseInt(s_2));
    }
}