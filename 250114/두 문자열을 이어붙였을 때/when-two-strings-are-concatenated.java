import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String s1 = str1+str2;
        String s2 = str2+str1;
        
        if (s1.equals(s2))
            System.out.print("true");
        else
            System.out.print("false");
    }
}