import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        String commend = sc.next();

        for (int i = 0; i < commend.length(); i++){
            if (commend.charAt(i) == 'L'){
                s = s.substring(1, len)+s.substring(0,1);
            } else {
                s = s.substring(len-1)+s.substring(0, len-1);
            }
        }
        System.out.print(s);
    }
}