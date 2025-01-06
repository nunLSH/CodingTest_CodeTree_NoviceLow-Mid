import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int minDifference = array[1] - array[0];

        for (int i = 0; i < n; i++){
            for (int k = i+1; k < n; k++){
                if (array[k] - array[i] < minDifference)
                    minDifference = array[k] - array[i];
            }
        }
        System.out.print(minDifference);
    }
}