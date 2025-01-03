import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();

            if (array[i] == 0){
                break;
            }
            cnt++;
        }

        for (int i = cnt-1; i >= 0; i--){
            System.out.print(array[i]+ " ");
        }
    }
}