import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();      
        }

        for (int i = n-1; i >= 0; i--){
            if (array[i] % 2 == 0)
                System.out.print(array[i]+" ");
        }
    }
}