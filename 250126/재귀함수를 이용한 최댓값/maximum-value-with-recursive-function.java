import java.util.Scanner;
public class Main {
    public static int max;
    public static int[] arr = new int[101];

    public static int printMax(int n){
        if (n == 0)
            return max;

        if (arr[n] > max)
            max = arr[n];
        
        return printMax(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i < n+1; i++) 
            arr[i] = sc.nextInt();

        max = arr[1];

        System.out.print(printMax(n));
    }
}