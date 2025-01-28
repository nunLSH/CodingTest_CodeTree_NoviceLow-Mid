import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1, 0, arr1.length);
        Arrays.sort(arr2, 0, arr2.length);

        String sorted1 = new String(arr1);
        String sorted2 = new String(arr2);

        System.out.print(sorted1.equals(sorted2) ? "Yes" : "No");
    }
}