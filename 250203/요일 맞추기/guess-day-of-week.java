import java.util.Scanner;
public class Main {
    public static int[] num_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int totalDays(int month, int day){
        int days = 0;
        for (int i = 1; i < month; i++)
            days += num_days[i];
        days += day;

        return days;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int difference = 0;
        difference = totalDays(m2, d2) - totalDays(m1, d1);

        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if (difference >= 0)
            System.out.print(dayOfWeek[difference % 7]);
        else {
            difference = Math.abs(difference);
            System.out.print(dayOfWeek[7 - (difference % 7)]);
        }
    }
}