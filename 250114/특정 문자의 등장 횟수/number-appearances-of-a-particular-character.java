import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals("ee"))
                cnt1++;
            if (str.substring(i, i+2).equals("eb"))
                cnt2++;
        }

        System.out.printf("%d %d", cnt1, cnt2);
    }
}