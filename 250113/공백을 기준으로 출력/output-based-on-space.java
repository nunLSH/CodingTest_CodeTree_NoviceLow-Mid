import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = 0; i < len1; i++){
            if (str1.charAt(i) != ' ')
                System.out.print(str1.charAt(i));
        }
        for (int i = 0; i < len2; i++){
            if (str2.charAt(i) != ' ')
                System.out.print(str2.charAt(i));
        }
    }
}