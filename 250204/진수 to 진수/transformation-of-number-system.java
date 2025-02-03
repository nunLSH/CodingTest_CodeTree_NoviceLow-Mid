import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int num = 0;
        for (int i = 0; i < n.length(); i++)
            num = num * a + (n.charAt(i) - '0');
        
        int cnt = 0;
        int[] base_b = new int[20];
        while(true){
            if (num < b){
                base_b[cnt++] = num;
                break;
            }
            base_b[cnt++] = num % b;
            num /= b;
        }

        for (int i = cnt - 1; i >= 0; i--)
            System.out.print(base_b[i]);
    }
}