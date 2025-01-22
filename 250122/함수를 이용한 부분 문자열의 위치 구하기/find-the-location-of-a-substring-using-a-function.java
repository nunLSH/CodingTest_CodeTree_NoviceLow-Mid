import java.util.Scanner;
public class Main {
    static String s, str;
    
    public static int isContain() {
        if (s.contains(str))
            return s.indexOf(str);
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        str = sc.next();

        System.out.print(isContain());
    }
}