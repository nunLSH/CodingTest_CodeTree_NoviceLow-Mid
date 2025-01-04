import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // 나머지의 횟수를 저장할 배열
        int[] rest = new int[b];
        int sum = 0;

        for (int i = 0; i < 1000; i++){
            a /= b;
            rest[a%b]++;

            if (a <= 1) 
                break;
        }

        for (int i = 0; i < b; i++)
            sum += (rest[i] * rest[i]);

        System.out.print(sum);
    }
}