import java.util.Scanner;
public class Main {
    public static String isDateExists(int m, int d){
        
        if ((m < 8 && m % 2 != 0) || (m >= 8 && m % 2 == 0 )){
            if (d <= 31)
                return "Yes";
            else 
                return "No";
        }
        
        if ((m < 7 && m % 2 == 0) || (m > 8 && m % 2 != 0)){
            if (d <= 30)
                return "Yes";
            else 
                return "No";
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