import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static String isEquals(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i] || arr1.length != arr2.length)
                return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1, 0, arr1.length);
        Arrays.sort(arr2, 0, arr2.length);

        System.out.print(isEquals(arr1, arr2));
    }
}