import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();

        String encoded = "";
        char curChar = str.charAt(0);
        int num = 1;

        for (int i = 1; i < len; i++){
            if(str.charAt(i) == curChar)
                num++;
            else {
                encoded += curChar;
                encoded += num;
                curChar = str.charAt(i);
                num = 1;
            }
        } 
        encoded += curChar;
        encoded += num;

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}