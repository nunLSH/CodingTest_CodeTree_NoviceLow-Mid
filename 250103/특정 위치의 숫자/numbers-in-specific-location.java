import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
        }

        System.out.print(array[2]+array[4]+array[9]);
    }
}