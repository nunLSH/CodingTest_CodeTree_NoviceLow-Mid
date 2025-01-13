import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        String s = "None";

        for (int i = 0; i < 10; i++){
            int len = arr[i].length();
            if (arr[i].charAt(len-1) == c) {
                s = arr[i];
                System.out.println(s);
            }
        }
        if (s.equals("None"))
            System.out.print(s);
    }
}