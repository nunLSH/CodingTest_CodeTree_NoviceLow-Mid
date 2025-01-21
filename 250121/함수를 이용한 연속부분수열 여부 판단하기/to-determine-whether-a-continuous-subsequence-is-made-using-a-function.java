import java.util.Scanner;
public class Main {
    public static String isSubsequence(int[] arr1, int[] arr2){
        int len = arr2.length;
        int startIndex = 0;
        
        for (int i = 0; i < arr1.length-len+1; i++){
            if (arr1[i] == arr2[0])
                startIndex = i;

            int cnt = 0;
            for (int j = 0; j < len; j++){
                if (arr1[j+startIndex] == arr2[j])
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