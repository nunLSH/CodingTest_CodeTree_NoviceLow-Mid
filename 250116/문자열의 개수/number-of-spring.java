import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String[] arr = new String[201];
        for (int i = 1; i < 201; i++) {
            arr[i] = sc.next();

            if (arr[i].equals("0")) 
                break;
            cnt++;
        }

        System.out.println(cnt);
        for (int i = 0; i < cnt; i += 2){
            System.out.println(arr[i]);
        }
    }
}