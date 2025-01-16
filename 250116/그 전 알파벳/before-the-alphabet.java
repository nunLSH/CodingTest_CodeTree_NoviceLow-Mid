import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int al = (int)sc.next().charAt(0);

        if (al == 'a')
            System.out.print('z');
        else
            System.out.print((char)(al-1));
    }
}