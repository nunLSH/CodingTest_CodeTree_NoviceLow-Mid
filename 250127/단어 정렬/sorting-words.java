import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}