import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++){
            int q_type = sc.nextInt();

            // 1 a
            if (q_type == 1) {
                int a = sc.nextInt();

                System.out.println(array[a-1]);
            }

            // 2 b
            if (q_type == 2) {
                int b = sc.nextInt();
                int index = -1;

                for (int k = 0; k < n; k++){
                    if (array[k] == b) {
                        index = k;
                        break;
                    }
                }
                
                System.out.println(index+1);  
            }

            // 3 s e
            if (q_type == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int k = s-1; k < e; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }
}