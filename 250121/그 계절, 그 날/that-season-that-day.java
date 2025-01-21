import java.util.Scanner;
public class Main {

    public static boolean isLeapYear(int year){
        if (year % 4 != 0)
            return false;
        if (year % 100 == 0 && year % 400 != 0)
            return false;

        return true;
    }

    public static String leapYearSeason(int m, int d){
        if (m == 2){
                if (d <= 29)
                    return "Winter";
            } else if (m == 1 || m == 12){
                if (d <= 31)
                    return "Winter";
            } else if (2 < m && m < 6){
                if (m == 4){
                    if (d < 31)
                        return "Spring";
                } else {
                    if (d <= 31)
                        return "Spring";
                }
            } else if (5 < m && m < 9) {
                if (m == 6){
                    if (d < 31)
                        return "Summer";
                } else {
                    if (d <= 31)
                        return "Summer";
                }
            } else {
                if (m == 10){
                    if (d <= 31)
                        return "Fall";
                } else {
                    if (d < 31)
                        return "Fall";
                }
            }
        return "-1";
    }

    public static String whatSeason(int m, int d){
        if (m == 2){
                if (d < 29)
                    return "Winter";
            } else if (m == 1 || m == 12){
                if (d <= 31)
                    return "Winter";
            } else if (2 < m && m < 6){
                if (m == 4){
                    if (d < 31)
                        return "Spring";
                } else {
                    if (d <= 31)
                        return "Spring";
                }
            } else if (5 < m && m < 9) {
                if (m == 6){
                    if (d < 31)
                        return "Summer";
                } else {
                    if (d <= 31)
                        return "Summer";
                }
            } else {
                if (m == 10){
                    if (d <= 31)
                        return "Fall";
                } else {
                    if (d < 31)
                        return "Fall";
                }
            }
        return "-1";
    }

    public static String isExists(int y, int m, int d){
        if (isLeapYear(y) == true){
            return leapYearSeason(m, d);
        }

        if (isLeapYear(y) == false){
            return whatSeason(m, d);
        }

        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isExists(y, m, d));
    }
}