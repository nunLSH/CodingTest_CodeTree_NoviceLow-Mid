import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int mins = sc.nextInt();

        int ghour = sc.nextInt();
        int gmin = sc.nextInt();

        int elapsedTime = 0;

        while(true) {
            if(hour == ghour && mins == gmin)
                break;
            
            elapsedTime++;
            mins++;

            if(mins == 60) {
                hour++;
                mins = 0;
            }
        }
        
        System.out.print(elapsedTime);
    }
}
