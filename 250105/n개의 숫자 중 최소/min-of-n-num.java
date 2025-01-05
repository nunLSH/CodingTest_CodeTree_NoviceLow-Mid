import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        
        int min = array[0];

        for (int i = 0; i < n; i++){
            if (array[i] < min)
                min = array[i];
        }

        int cnt = 0;

        for (int i = 0; i < n; i++){
            if (array[i] == min)
                cnt++;
        }

        System.out.printf("%d %d", min, cnt);
    }
}