import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int temp = 0;

        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                if (array[i] < array[k]) {
                    array[i] = array[i];
                } else {
                    temp = array[k];
                    array[k] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.print(array[0]+" "+array[1]);
    }
}