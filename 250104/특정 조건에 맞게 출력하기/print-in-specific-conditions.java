import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];

        for (int i = 0; i < 100; i++){
            array[i] = sc.nextInt();
            if (array[i] == 0)
                break;
            
            if (array[i] % 2 != 0)
                System.out.print(array[i]+3 +" ");
            else
                System.out.print(array[i]/2 +" ");
        }
    }
}