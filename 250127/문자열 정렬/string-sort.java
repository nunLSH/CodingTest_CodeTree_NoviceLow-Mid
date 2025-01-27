import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sortedString = new String(c);
        System.out.print(sortedString);
    }
}