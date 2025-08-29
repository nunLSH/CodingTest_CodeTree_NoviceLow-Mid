import java.util.*;
public class Main {
    public static int n, h, t;
    public static final int MAX = 100;
    public static int[] field = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        h = sc.nextInt();
        t = sc.nextInt();
        for (int i = 0; i < n; i++)
            field[i] = sc.nextInt();

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n+1-t; i++){
            int cost = 0;
                for (int k = i; k < i + t; k++)
                    cost += Math.abs(h-field[k]);
            
                minCost = Math.min(minCost, cost);
        }
        System.out.print(minCost);
    }
}