import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[10];
        int cnt = 0, index = 0;

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();

            if (array[i] == 2)
                cnt++;
            
            if (cnt == 3) {
                index = i;
                break;
            }
        }
        System.out.print(index+1);
    }
}