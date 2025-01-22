import java.util.Scanner;
public class Main {
    public static String isPalindrome(String s){
        String str = "";

        for (int i = s.length() - 1; i >= 0; i--){
            str += s.charAt(i);
        }

        if (s.equals(str))
            return "Yes";
        
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(isPalindrome(s));        
    }
}