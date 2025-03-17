import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();
        int max = 0;

        for (int i = 0; i < len; i++){
            String newA = "";
            if (a.charAt(i) == '1'){
                if (i != len - 1)
                    newA = a.substring(0, i) + '0' + a.substring(i+1);
                else 
                    newA = a.substring(0, i) + '0';
            } else {
                if (i != len - 1)
                    newA = a.substring(0, i) + '1' + a.substring(i+1);
                else 
                    newA = a.substring(0, i) + '1';
            }

            int n = 0;
            for (int j = newA.length() - 1; j >= 0; j--){
                int cnt = 0;
                if (newA.charAt(j) == '1'){
                    cnt = 1;
                    if (j == newA.length() - 1)
                        cnt *= 1;
                    else {
                        for (int k = 0; k < newA.length() - j - 1; k++)
                            cnt *= 2;
                    }
                }
                n += cnt;
            }
            max = Math.max(n, max);
        }
        System.out.println(max);
    }
}