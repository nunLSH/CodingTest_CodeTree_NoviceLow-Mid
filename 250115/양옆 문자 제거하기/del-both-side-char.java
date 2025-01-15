import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        str = str.substring(0,1)+str.substring(2,len-2)+str.substring(len-1);
        System.out.print(str);
    }
}