import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int[] count = new int[11];

        for (int i = 0; i < 100; i++){
            array[i] = sc.nextInt();

            if (array[i] == 0)
                break;

            if (array[i] >= 10)
                count[array[i] / 10]++;
        }

        for (int i = 10; i >= 1; i--)
            System.out.println(i*10+" - "+count[i]);
    }
}