import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int[] count = new int[7];

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
            count[array[i]]++;
        }

        for (int i = 1; i <= 6; i++)
            System.out.println(i+" - "+count[i]);
    }
}