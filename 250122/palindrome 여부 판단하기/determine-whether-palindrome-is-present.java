import java.util.Scanner;
public class Main {
    public static String s; 

    public static String isPalindrome(String s){

        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return "No";
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();

        System.out.print(isPalindrome(s));        
    }
}