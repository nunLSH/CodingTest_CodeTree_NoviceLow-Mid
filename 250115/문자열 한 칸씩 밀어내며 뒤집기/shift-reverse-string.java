import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++){
            int num = sc.nextInt();

            if (num == 1){
                s = s.substring(1)+s.substring(0,1);
            } else if (num == 2){
                s = s.substring(len-1)+s.substring(0,len-1);
            } else {
                StringBuffer sb = new StringBuffer(s);
                s = sb.reverse().toString();
            }
            System.out.println(s);
        }
    }
}