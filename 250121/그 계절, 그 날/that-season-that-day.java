import java.util.Scanner;
public class Main {

    public static boolean isLeapYear(int year){
        if (year % 4 != 0)
            return false;
        if (year % 100 != 0)
            return true;
        if (year % 400 == 0)
            return true;

        return false;
    }

    public static String whatSeason(int y, int m, int d){

        int[] numOfDays = new int[]{0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        numOfDays[2] = isLeapYear(y) ? 29 : 28;
        
        if (d <= numOfDays[m]){
            if (m == 12 || m > 0 && m < 3)
                return "Winter";
            else if (2 < m && m < 6)
                return "Spring";
            else if (5 < m && m < 9)
                return "Summer";
            else
                return "Fall";
        }

        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(whatSeason(y, m, d));
    }
}