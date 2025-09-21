import java.util.*;
public class Main {
    public static int n, c, g, h;
    public static final int MAX = 1000;
    public static int[] ta = new int[MAX];
    public static int[] tb = new int[MAX];

    public static int calcWork (int i, int temp){
        int workload = 0;
        if (temp < ta[i])
            workload = c;
        else if (ta[i] <= temp && temp <= tb[i])
            workload = g;
        else
            workload = h;

        return workload;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        for (int i = 0; i < n; i++){
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int maxWork = 0;
        for (int i = 0; i < MAX; i++){ // 온도
            int sum = 0;
            for (int j = 0; j < n; j++){ // 작업
                int work = calcWork(j, i);
                sum += work;
            }
            maxWork = Math.max(sum, maxWork);
        }
        System.out.print(maxWork);
    }
}