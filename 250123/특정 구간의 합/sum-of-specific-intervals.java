import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int a1, a2;
    public static int[] arr = new int[100];

    public static int getAnswer(){
        int sum = 0;

        for (int i = a1-1; i < a2; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++){
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            System.out.println(getAnswer());
        }

    }
}