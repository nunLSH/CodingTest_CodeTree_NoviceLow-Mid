import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int mins = sc.nextInt();

        int ghour = sc.nextInt();
        int gmins = sc.nextInt();

        int elapsedTime = 0;

        elapsedTime = (ghour * 60 + gmins) - (hour * 60 + mins);

        System.out.print(elapsedTime);
    }
}
