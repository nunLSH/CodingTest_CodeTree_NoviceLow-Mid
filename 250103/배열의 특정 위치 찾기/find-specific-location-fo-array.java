import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int sum = 0, sum_3 = 0;

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();

            if (i % 2 != 0)
                sum += array[i];

            if ((i+1) % 3 == 0)
                sum_3 += array[i];
        }
        System.out.printf("%d %.1f", sum, (double)sum_3/3);
    }
}