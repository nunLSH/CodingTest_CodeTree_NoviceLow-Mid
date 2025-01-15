import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String remove = sc.next();
        int len = remove.length();
        int index = 0;

        while (str.indexOf(remove) != -1){
            index = str.indexOf(remove);
            str = str.substring(0, index)+str.substring(index+len);
        }
        System.out.print(str);
    }
}