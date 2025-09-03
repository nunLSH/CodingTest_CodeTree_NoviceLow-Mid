import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ability = new int[6];
        for (int i = 0; i < 6; i++)
            ability[i] = sc.nextInt();

        Arrays.sort(ability);

        int sumMax = 0, sumMin = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++){
            int sum = ability[i] + ability[5-i];
            sumMax = Math.max(sum, sumMax);
            sumMin = Math.min(sum, sumMin);
        }
        System.out.print(sumMax - sumMin);
    }
}