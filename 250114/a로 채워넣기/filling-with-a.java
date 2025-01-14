import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s= sc.next();
        int len = s.length();
        String newStr = "";

        newStr = s.substring(0,1)+"a"+s.substring(2,len-2)+"a"+s.substring(len-1, len);
        System.out.print(newStr);
    }
}