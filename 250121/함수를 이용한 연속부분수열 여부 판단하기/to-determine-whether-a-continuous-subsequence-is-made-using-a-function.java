import java.util.Scanner;
public class Main {
    public static String isSubsequence(int[] arr1, int[] arr2){
        int len = arr2.length;
        int[] newArr = new int[len];
        for (int i = 0; i < arr1.length-len+1; i++){
            for (int j = 0; j < len; j++){
                newArr[j] = arr1[i+j];
            }

            int cnt = 0;
            for (int k = 0; k < len; k++){
                if (newArr[k] == arr2[k])
                    cnt++;
            }
            if (cnt == len)
                return "Yes";
        }
        
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];


        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        System.out.print(isSubsequence(arr1, arr2));
    }
}