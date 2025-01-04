import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++){
            array[i] = n*(i+1);
            System.out.print(array[i]+" ");

            if (array[i] % 5 == 0)
                cnt++;

            if (cnt == 2)
                break;
        }
    }
}