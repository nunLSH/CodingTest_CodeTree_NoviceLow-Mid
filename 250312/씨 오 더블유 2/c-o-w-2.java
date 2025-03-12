import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int len = s.length();

        int cnt = 0;
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                for (int k = j+1; k < len; k++){
                    if(s.charAt(i) == 'C' && s.charAt(j) == 'O' && s.charAt(k) == 'W')
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}