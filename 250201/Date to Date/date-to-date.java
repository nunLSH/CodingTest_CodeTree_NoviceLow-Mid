import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        int gmonth = sc.nextInt();
        int gday = sc.nextInt();

        int elapsedDays = 0;

        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(month == gmonth && day == gday)
                break;
        
            elapsedDays++;
            day++;
        
            if(day > num_of_days[month]) {
                month++;
                day = 1;
            }
        }
        
        System.out.print(elapsedDays+1);
    }
}
