import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int[] count = new int[10];

        for (int i = 0; i < 100; i++){
            array[i] = sc.nextInt();

            if (array[i] == 0)
                break;

            count[array[i]/10]++;
        }

        for (int i = 1; i <= 9; i++)
            System.out.println(i+" - "+count[i]);
    }
}