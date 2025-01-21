import java.util.Scanner;
public class Main {
    public static String isDateExists(int m, int d){
        if (m > 12 || d > 31)
            return "No";

        if (m == 2 && d <= 28)
            return "Yes";
        
        if ((m < 8 && m % 2 != 0) || (m >= 8 && m % 2 == 0 )){
            if (d <= 31)
                return "Yes";
        }
        
        if ((m < 7 && m % 2 == 0) || (m > 8 && m % 2 != 0)){
            if (d <= 30)
                return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isDateExists(m, d));
    }
}