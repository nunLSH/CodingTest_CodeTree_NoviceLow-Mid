import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int len = a.length();
        int n = 0, max = 0;

        for (int i = 1; i < len; i++){
            String newA = "";
            if (a.charAt(i) == '1')
                newA = a.substring(0, i) + '0' + a.substring(i+1);
            else 
                newA = a.substring(0, i) + '1' + a.substring(i+1);
                
            for (int j = newA.length() - 1; j >= 0; j--){
                n += (newA.charAt(j) - '0') * 2;
            }
            max = Math.max(n, max);
        }
        System.out.println(max);
    }
}