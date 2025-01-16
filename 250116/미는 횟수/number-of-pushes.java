import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = sc.next();
        int len = s.length();
        int cnt = 0;

        for (int i = 0; i < len; i++){
            s = s.substring(len-1)+s.substring(0,len-1);
            cnt++;

            if (s.equals(str))
                break;
        }
        
        if (cnt == 0)
            System.out.print(-1);
        else
            System.out.print(cnt);
    }
}