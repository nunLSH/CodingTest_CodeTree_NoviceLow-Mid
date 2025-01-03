import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= num; i++){
            int[] score = new int[4];
            int sum = 0;
            double avg = 0;

            for (int k = 0; k < 4; k++){
                score[k] = sc.nextInt();
                sum += score[k];
            }
            avg = (double)sum / 4;

            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else
                System.out.println("fail");
        }
        System.out.print(cnt);
    }
}