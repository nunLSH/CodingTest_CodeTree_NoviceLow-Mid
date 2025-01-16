import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String[] arr = new String[201];
        for (int i = 1; i < 201; i++) {
            String s = sc.next();

            if (s.equals("0")) 
                break;
            cnt++;
            
            arr[i] = s;
        }

        System.out.println(cnt);
        for (int i = 1; i < cnt+1; i++){
            if (i % 2 != 0)
                System.out.println(arr[i]);
        }
    }
}