import java.util.Scanner;
public class Main {
    public static void printNum1(int n) {
        int cnt = 0;
        if (cnt == 7)
            return;

        for (int i = 1; i <= n; i++){
            System.out.print(i+" ");
            cnt++;
        }
    }

    public static void printNum2(int n) {
        int cnt = 0;
        if (cnt == 7)
            return;

        for (int i = n; i >= 1; i--){
            System.out.print(i+" ");
            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNum1(n);
        System.out.println();
        printNum2(n);
    }
}