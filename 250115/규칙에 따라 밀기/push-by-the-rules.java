import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int s_len = s.length();
        String commend = sc.next();
        int len = commend.length();

        for (int i = 0; i < len; i++){
            if (commend.charAt(i) == 'L'){
                s = s.substring(1, s_len)+s.substring(0,1);
            } else {
                s = s.substring(s_len-1)+s.substring(0, s_len-1);
            }
        }
        System.out.print(s);
    }
}