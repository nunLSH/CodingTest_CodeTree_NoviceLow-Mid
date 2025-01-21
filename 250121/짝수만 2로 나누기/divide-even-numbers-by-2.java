import java.util.Scanner;
public class Main {
    public static int n;

    public static void changeArray(int[] arr){
        for (int i = 0; i < n; i++){

            if (arr[i] % 2 == 0){
                arr[i] /= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        changeArray(arr);

        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}