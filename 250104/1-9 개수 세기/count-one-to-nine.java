import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            
            for (int j = 1; j < 10; j++){
                if (array[i] == j)
                    count[j]++;
            }
        }

        for (int i = 1; i <= 9; i++)
            System.out.println(count[i]);
    }
}