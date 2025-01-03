import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int n = 0;

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();

            if (array[i] % 3 == 0){
                n = i;
                break;
            }
        }
        System.out.print(array[n-1]);
    }
}