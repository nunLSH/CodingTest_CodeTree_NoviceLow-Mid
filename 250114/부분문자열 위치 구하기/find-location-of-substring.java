import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String o = sc.next();

        System.out.print(str.indexOf(o));
    }
}