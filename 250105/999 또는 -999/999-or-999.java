import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int len = 0;

        for (int i = 0; i < 100; i++){
            array[i] = sc.nextInt();

            if (array[i] == 999 || array[i] == -999) {
                len = i;
                break;
            }
        }

        int min = array[0], max = array[0];

        for (int i = 0; i < len; i++){
            if (array[i] < min)
                min = array[i];
            
            if (array[i] > max)
                max = array[i];
        }

        System.out.printf("%d %d", max, min);
    }
}