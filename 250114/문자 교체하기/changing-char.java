import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        str2 = str1.substring(0,2)+str2.substring(2);

        System.out.print(str2);
    }
}