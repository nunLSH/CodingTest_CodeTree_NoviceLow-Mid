import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        array[0] = 1;
        array[1] = sc.nextInt();

        int cnt = 2;

        for (int i = 2; i < 100; i++){
            array[i] = array[i-1] + array[i-2];
            cnt++;

            if (array[i] > 100){
                break;
            }
        }

        for (int i = 0; i < cnt; i++)
            System.out.print(array[i]+" ");
    }
}