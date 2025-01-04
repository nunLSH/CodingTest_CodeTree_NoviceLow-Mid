import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();

        for (int i = 2; i < 10; i++)
            array[i] = array[i-1] + 2*array[i-2];

        for (int i = 0; i < 10; i++)
            System.out.print(array[i]+" ");
    }
}