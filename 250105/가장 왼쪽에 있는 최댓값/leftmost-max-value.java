import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int max_index = n;

        while(max_index > 0){
            int index = 0;
            int max = array[0];

            for (int i = 0; i < max_index; i++){
                if (array[i] > max){
                    max = array[i];
                    index = i;
                }
            }
            max_index = index;
            System.out.print(index+1+" ");
        }
    }
}