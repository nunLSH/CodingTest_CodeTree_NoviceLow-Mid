import java.util.Scanner;
public class Main {
    public static int totalDays (int m, int d){
        int[] month_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
        
        int totalDays = 0;
        for (int i = 1; i < m; i++)
            totalDays += month_days[i];
        totalDays += d;

        return totalDays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String weekday = sc.next();
        String[] daysOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int index = 0;
        for (int i = 0; i < 7; i++){
            if (daysOfWeek[i].equals(weekday))
                index = i;
        }

        int totalDays1 = totalDays(m1, d1);
        int totalDays2 = totalDays(m2, d2);

        int diff = totalDays2 - totalDays1;

        int count = diff / 7;
        if (diff % 7 >= index)
            count++;

        System.out.print(count);
    }
}