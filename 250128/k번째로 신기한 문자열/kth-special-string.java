import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];

        int index = 0;
        for (int i = 0; i < n; i++){
            String str = sc.next();
            if (str.charAt(0) == t.charAt(0) && str.charAt(1) == t.charAt(1)){
                arr[index] = str;
                index++;
            }
        }
        Arrays.sort(arr, 0, index);
        System.out.print(arr[k-1]);
    }
}