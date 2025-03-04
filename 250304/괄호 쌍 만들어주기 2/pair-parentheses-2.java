import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();

        int cnt = 0;
        for (int i = 0; i < len - 3; i++){
            for (int j = i+2; j < len - 1; j++){
                if (a.substring(i, i+2).equals("((") && a.substring(j, j+2).equals("))"))
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}