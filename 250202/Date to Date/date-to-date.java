import java.util.Scanner;

public class Main {
    public static int numOfDays(int m, int d){
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 1; i < m; i++)
            totalDays += days[i];
        totalDays += d;

        return totalDays;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();

        int gmonth = sc.nextInt();
        int gday = sc.nextInt();

        System.out.print(numOfDays(gmonth, gday) - numOfDays(month, day) + 1);
    }
}
