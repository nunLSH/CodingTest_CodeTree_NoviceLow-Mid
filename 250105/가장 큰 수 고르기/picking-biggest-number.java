import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++)
            array[i] = sc.nextInt();
        
        int max = array[0];

        for (int i = 0; i < 10; i++){
            if (array[i] > max)
                max = array[i];
        }
        System.out.print(max);
    }
}