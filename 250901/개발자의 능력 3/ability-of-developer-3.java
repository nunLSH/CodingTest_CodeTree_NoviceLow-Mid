import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];

        int sum = 0;

        for (int i = 0; i < 6; i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }
        
        int minDis = 1000000;
        for (int i = 0; i < 6; i++){
            for (int j = i+1; j < 6; j++){
                int team1 = 0, team2 = 0;
                for (int k = j+1; k < 6; k++){
                    if (i != j && j !=k)
                        team1 += score[k];
                }
                team2 = sum - team1;
                int diff = Math.abs(team1 - team2);
                minDis = Math.min(minDis, diff);
            }
        }
        System.out.print(minDis);
    }
}