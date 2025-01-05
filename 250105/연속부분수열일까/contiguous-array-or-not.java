import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for (int i = 0; i < n1; i++)
            array1[i] = sc.nextInt();

        for (int i = 0; i < n2; i++)
            array2[i] = sc.nextInt();

        int index = 0;
        int[] new_array = new int[n2];
        
        for (int i = 0; i < n1; i++){
            if (array1[i] == array2[0] && array1[i+n2-1] == array2[n2-1]) {
                index = i;
                break;
            }

            if (array1[i] == array2[0]) {
                index = i;
                break;
            }
        }

        int cnt = 0;
        for (int i = index; i < index+n2; i++){
            if (array1[i] == array2[i-index])
                cnt++;
        }

        if (cnt == n2)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}