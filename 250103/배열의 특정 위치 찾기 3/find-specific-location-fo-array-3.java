import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int n = 0;

        for (int i = 0; i < 100; i++){
            array[i] = sc.nextInt();

            if (array[i] == 0){
                n = i-1;
                break;
            }
        }
        System.out.print(array[n]+array[n-1]+array[n-2]);
    }
}