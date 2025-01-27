import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int n;
    public static int[] a = new int[100];
    public static int[] b = new int[100];

    public static boolean equal() {
        for(int i = 0; i < n; i++)
            if(a[i] != b[i])
                return false;
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        Arrays.sort(a, 0, n);
        Arrays.sort(b, 0, n);

        if(equal())
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}